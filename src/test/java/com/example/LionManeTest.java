package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionManeTest {

    private final String sex;
    private final boolean isMane;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;
    Lion lion;

    public LionManeTest(String sex, boolean isMane) {
        this.sex = sex;
        this.isMane = isMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }
    @Test
    public void doesLionHaveManeTest() throws Exception {
            lion = new Lion(sex, feline);
            Assert.assertEquals(isMane, lion.doesHaveMane());
        }
    }

