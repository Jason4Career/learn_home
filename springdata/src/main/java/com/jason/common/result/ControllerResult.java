package com.jason.common.result;

/**
 * Created by Jason on 2017/8/3.
 */
public class ControllerResult implements Result {

    /**
     * 消息码，0代表成功，1代表异常
     */
    private int code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ControllerResult() {
    }

    public ControllerResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ControllerResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ControllerResult init(Object data) {
        return new ControllerResult(0, null, data);
    }
}
