package com.jason.strategy.model;

import com.jason.strategy.util.MyCompareable;
import com.jason.strategy.util.MyComparetor;

/**
 * Created by Jason on 2017/7/25.
 */
public class Dog implements MyCompareable<Dog> {

    /**
     * 饭量
     */
    private Double food;

    /**
     * 比较策略
     */
    private MyComparetor<Dog> comparetor;

    public Double getFood() {
        return food;
    }

    public void setFood(Double food) {
        this.food = food;
    }

    public MyComparetor<Dog> getComparetor() {
        return comparetor;
    }

    public void setComparetor(MyComparetor<Dog> comparetor) {
        this.comparetor = comparetor;
    }

    public Dog(Double food, MyComparetor<Dog> comparetor) {
        this.food = food;
        this.comparetor = comparetor;
    }

    public Integer compareTo(Dog t1) {
        return comparetor.comparre(this, t1);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food + '}';
    }
}
