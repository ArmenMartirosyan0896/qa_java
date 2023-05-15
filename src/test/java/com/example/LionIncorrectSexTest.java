package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionIncorrectSexTest {
    private final String sex;
    private final boolean isMane;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;
    Lion lion;

    public LionIncorrectSexTest(String sex, boolean isMane) {
        this.sex = sex;
        this.isMane = isMane;
    }

    @Parameterized.Parameters
    public static Object[] incorrectSexParameters() {
        return new Object[]{
                "Самей",
                "Детеныш"
        };
    }
    @Test(expected = Lion.LionException.class)
    public void incorrectSexThrowsExceptionTest() throws Exception {
        try {
            lion = new Lion(sex, feline);
            Assert.assertEquals(isMane, lion.doesHaveMane());
        } catch (Exception exception) {
            Assert.fail("Тест упадет при данном исключении");
        }
        }

    }


