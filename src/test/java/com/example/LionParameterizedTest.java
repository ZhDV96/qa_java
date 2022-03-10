package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final Boolean expected;

@Mock
Feline feline;

public LionParameterizedTest(String sex, boolean expected) {
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

    @Test
    public void getDoesHaveManeLion() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}
