package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionExceptionTest {

    private final String sex;
    private final boolean expected;

    @Mock
    Feline feline;

    public LionExceptionTest(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Неизвестный пол", true},
        };
    }

    @Test
    public void checkThatGetFoodReturnFood() throws Exception {
        Exception exception = null;
        try {
            Lion lion = new Lion(sex, feline);
            lion.doesHaveMane();
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
