package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatFelineTest() throws Exception{
        List<String> expectedFelineFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFelineFood = feline.eatMeat();
        Assert.assertEquals("Неверный список еды!",expectedFelineFood, actualFelineFood);
    }
    @Test
    public void getFamilyFelineTest(){
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Неправильное название семейства!",expectedFamily, actualFamily);
    }

    @Test
    public void getKittensFelineTest(){
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals("Неправильное количество котят!", expectedKittens, actualKittens);
    }

    @Test
    public void getKittensWithParametrsTest(){
        int expectedKittens = 1;
        int actualKittens = feline.getKittens(1);
        Assert.assertEquals("Неправильное количество котят!",expectedKittens, actualKittens);
    }
}
