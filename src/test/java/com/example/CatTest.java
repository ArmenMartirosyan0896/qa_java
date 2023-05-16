package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCatTest() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Животное издает неправильный звук!", "Мяу", cat.getSound());

    }

    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        cat.getFood();
        Mockito.verify(feline, Mockito.times(2)).eatMeat();
    }
}
