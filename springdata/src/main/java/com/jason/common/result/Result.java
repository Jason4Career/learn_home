package com.jason.common.result;

/**
 * Created by Jason on 2017/8/3.
 */
public interface Result {

    /**
     * 消息码
     *
     * @return 0代表成功, 1代表异常
     */
    int getCode();

    /**
     * 错误消息
     *
     * @return
     */
    String getMsg();

    /**
     * 返回数据
     *
     * @return
     */
    Object getData();

}
