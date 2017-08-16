package com.jason.common.tip;

/**
 * Created by Jason on 2017/8/3.
 */
public class ControllerValidTip {

    private String field;

    private String msg;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ControllerValidTip(String field, String msg) {
        this.field = field;
        this.msg = msg;
    }
}
