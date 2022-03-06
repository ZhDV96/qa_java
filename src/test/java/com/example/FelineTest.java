package com.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnCorrectValueTest() throws Exception {
        List<String> expectedListFood =  List.of("Животные", "Птицы", "Рыба");
        List<String> actualListFood = feline.eatMeat();
        assertThat(expectedListFood, containsInAnyOrder(actualListFood.toArray()));
    }

    @Test
    public void getFamilyReturnCorrectValueTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithOutKittensCountReturnCorrectValueTest() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }

}
