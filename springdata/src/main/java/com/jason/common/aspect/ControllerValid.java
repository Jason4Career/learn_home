package com.jason.common.aspect;

import com.alibaba.fastjson.JSON;
import com.jason.common.http.ResponseContext;
import com.jason.common.result.ControllerResult;
import com.jason.common.tip.ControllerValidTip;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Jason on 2017/8/3.
 */
@Aspect
@Component
public class ControllerValid {

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)" +
            " || @annotation(org.springframework.web.bind.annotation.GetMapping)" +
            " || @annotation(org.springframework.web.bind.annotation.PostMapping)" +
            " || @annotation(org.springframework.web.bind.annotation.PutMapping)" +
            " || @annotation(org.springframework.web.bind.annotation.DeleteMapping)" +
            " || @annotation(org.springframework.web.bind.annotation.PatchMapping)"
    )
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //AOP获取目标方法签名
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint
                .getSignature();
        Method method = methodSignature.getMethod();
        //检查是否参数是否有注解
        Annotation[][] argAnnotations = method.getParameterAnnotations();
        Object[] args = proceedingJoinPoint.getArgs();//获取参数值

        BindingResult result = null;

        if (method.getName().equals("errorHtml")) {//springmvc 错误请求
            return proceedingJoinPoint.proceed(args);
        }
        //检查MODEL/TO(模型对象)字段是否添加注解控制
        for (int i = 0, len = args.length; i < len; i++) {
            Object object = args[i];
            if (null != object) {
                if (null == result && object instanceof BindingResult) {
                    result = (BindingResult) object;
                }
                if (null != argAnnotations[i] && argAnnotations[i].length > 0) {//检测是否带注解
                    if (null != result) {
                        break;
                    }
                }
            }
        }
        if (null != result && writeResult(result)) {
            return null;
        }
        return proceedingJoinPoint.proceed(args);
    }

    protected boolean writeResult(BindingResult result) {
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            if (null != fieldErrors && fieldErrors.size() > 0) {
                ControllerResult actResult = new ControllerResult();
                actResult.setCode(1);
                actResult.setMsg("参数检验不通过");
                actResult.setData(new ControllerValidTip(fieldErrors.get(0).getField(), fieldErrors.get(0).getDefaultMessage()));
                ResponseContext.writeData(JSON.toJSONString(actResult));
                return true;
            }
        }
        return false;
    }
}
