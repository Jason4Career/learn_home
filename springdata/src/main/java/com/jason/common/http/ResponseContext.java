package com.jason.common.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huanghuanlai on 2017/1/14.
 */
public final class ResponseContext {
    private static final Logger LOGGER = LoggerFactory.getLogger(ResponseContext.class);

    private ResponseContext() {
    }

    /**
     * 获取http请求Request的response对象
     *
     * @return response
     */
    public static HttpServletResponse get() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();//springmvc 自带
    }

    private static HttpServletResponse init() {
        HttpServletResponse response = get();
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        return response;
    }

    public static void writeData(String data) {
        try {
            init().getWriter().print(data);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }


}
