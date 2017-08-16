package com.jason.strategy.util;

import com.jason.strategy.model.Cat;

/**
 * Created by Jason on 2017/7/25.
 */
public class CatHeightComparetor implements MyComparetor<Cat> {

    /**
     * 根据身高比较
     * @param cat1
     * @param cat2
     * @return
     */
    public Integer comparre(Cat cat1, Cat cat2) {
        if (cat1.getHeight() > cat2.getHeight()) {
            return 1;
        } else if (cat1.getHeight() < cat2.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
