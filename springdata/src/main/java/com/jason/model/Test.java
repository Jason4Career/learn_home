package com.jason.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Jason on 2017/8/4.
 */
public class Test {

    public interface ValidName {
    }

    @NotBlank(message = "名字不能为空",groups = Test.ValidName.class)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
