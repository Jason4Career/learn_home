package com.jason.strategy.util;

/**
 * Created by Jason on 2017/7/25.
 */
public class DataSorter {

    public static void sort(Object[] arrays) {
        if (arrays != null && arrays.length > 0) {
            for (int i = arrays.length; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    if (arrays[j] instanceof MyCompareable) {
                        MyCompareable compareable1 = (MyCompareable) arrays[j];
                        MyCompareable compareable2 = (MyCompareable) arrays[j + 1];
                        if (compareable1.compareTo(compareable2) == 1) {
                            swap(arrays, j, j + 1);
                        }
                    } else {
                        throw new RuntimeException("比较对象必须实现比较器");
                    }
                }
            }
        }
    }

    public static void swap(Object[] arrays, int x, int y) {
        Object temp = arrays[x];
        arrays[x] = arrays[y];
        arrays[y] = temp;

    }

    public static void print(Object[] arrays) {
        if (arrays != null && arrays.length > 0) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i] + " ");
            }
        }
    }
}
