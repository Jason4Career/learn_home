package com.jason.strategy;


import com.jason.strategy.model.Cat;
import com.jason.strategy.model.Dog;
import com.jason.strategy.util.CatHeightComparetor;
import com.jason.strategy.util.DataSorter;
import com.jason.strategy.util.DogFoodComparetor;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StrategyTest {

    @Test
    public void sortArrays() {
        Cat[] cats = new Cat[]{new Cat(5.0, 5.0, new CatHeightComparetor()), new Cat(3.0, 3.0, new CatHeightComparetor()), new Cat(1.0, 1.0, new CatHeightComparetor())};
        Dog[] dogs = new Dog[]{new Dog(5.0, new DogFoodComparetor()), new Dog(3.0, new DogFoodComparetor()), new Dog(1.0, new DogFoodComparetor())};

        DataSorter.sort(cats);
        DataSorter.print(cats);

        DataSorter.sort(dogs);
        DataSorter.print(dogs);
    }

}
