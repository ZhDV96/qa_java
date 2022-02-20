package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final Boolean expected;

@Mock
Feline feline;

public LionParameterizedTest(String sex, Boolean expected) {
    this.sex = sex;
    this.expected = expected;
}

    @Parameterized.Parameters
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getDoesHaveManeLion() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensFelineCorrectValue() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFamilyCorrectString() {
        String expectedFamilyString = "Кошачьи";
        String actualFamilyString = feline.getFamily();
        assertEquals(expectedFamilyString, actualFamilyString);
    }
}
