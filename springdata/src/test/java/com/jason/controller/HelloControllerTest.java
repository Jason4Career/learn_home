package com.jason.controller;

import com.jason.common.result.ControllerResult;
import com.jason.common.result.Result;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jason on 2017/8/5.
 */
public class HelloControllerTest {
    @Test
    public void say() throws Exception {

        HelloController helloController = new HelloController();
        Result result = helloController.say();

//        Assert.assertEquals((Result)ControllerResult.init("hello , world !"),result);
        Assert.assertNotNull(result);
    }

}