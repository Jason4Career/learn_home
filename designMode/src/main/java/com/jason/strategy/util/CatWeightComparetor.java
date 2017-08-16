package com.jason.strategy.util;

import com.jason.strategy.model.Cat;

/**
 * Created by Jason on 2017/7/25.
 */
public class CatWeightComparetor implements MyComparetor<Cat> {

    /**
     * 根据体重比较
     *
     * @param cat1
     * @param cat2
     * @return
     */
    public Integer comparre(Cat cat1, Cat cat2) {
        if (cat1.getWeight() > cat2.getWeight()) {
            return 1;
        } else if (cat1.getWeight() < cat2.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
