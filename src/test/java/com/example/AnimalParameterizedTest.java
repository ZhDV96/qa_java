package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String animalKind;
    private final List<String> animalFood;

    @Parameterized.Parameters
    public static Object[][] getAnimalData() {
        return new Object[][]{
            {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    public AnimalParameterizedTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Test
    public void checkThatGetFoodReturnFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(animalFood, actual);
    }

}
