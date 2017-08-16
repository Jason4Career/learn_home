package com.jason.strategy.util;

import com.jason.strategy.model.Cat;
import com.jason.strategy.model.Dog;

/**
 * Created by Jason on 2017/7/25.
 */
public class DogFoodComparetor implements MyComparetor<Dog> {

    /**
     * 根据身高比较
     * @param dog1
     * @param dog2
     * @return
     */
    public Integer comparre(Dog dog1, Dog dog2) {
        if (dog1.getFood() > dog2.getFood()) {
            return 1;
        } else if (dog1.getFood() < dog2.getFood()) {
            return -1;
        } else {
            return 0;
        }
    }
}
