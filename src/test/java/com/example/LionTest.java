package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception{
        Lion lion = new Lion("Самка", feline);
        lion.getKittens();
        lion.getKittens();
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(3)).getKittens();
    }

    @Test
    public void getFoodLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        lion.getFood();
        Mockito.verify(feline, Mockito.times(2)).getFood("Хищник");
    }
}
