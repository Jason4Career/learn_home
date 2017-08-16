package com.jason.strategy.model;

import com.jason.strategy.util.MyCompareable;
import com.jason.strategy.util.MyComparetor;

/**
 * Created by Jason on 2017/7/25.
 */
public class Cat implements MyCompareable<Cat> {

    /**
     * 身高
     */
    private Double height;

    /**
     * 体重
     */
    private Double weight;


    /**
     * 比较策略
     */
    private MyComparetor<Cat> comparetor;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public MyComparetor<Cat> getComparetor() {
        return comparetor;
    }

    public void setComparetor(MyComparetor<Cat> comparetor) {
        this.comparetor = comparetor;
    }

    public Integer compareTo(Cat cat) {
        return comparetor.comparre(this, cat);
    }

    public Cat(Double height, Double weight, MyComparetor<Cat> comparetor) {
        this.height = height;
        this.weight = weight;
        this.comparetor = comparetor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight + '}';
    }
}
