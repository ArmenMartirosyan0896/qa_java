package com.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionIncorrectSexTest {
    private final String sex;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;
    Lion lion;

    public LionIncorrectSexTest(String sex) {
        this.sex = sex;
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
        lion = new Lion(sex, feline);
        lion.doesHaveMane();
    }
}
