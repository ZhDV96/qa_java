package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalExceptionTest {

    private final String animalKind;
    private final List<String> animalFood;

    @Parameterized.Parameters
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Неизвестный вид", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    public AnimalExceptionTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Test
    public void checkThatGetFoodReturnFood() throws Exception {
        Exception exception = null;
        try {
            Animal animal = new Animal();
            animal.getFood(animalKind);
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test
    public void getFamilyCorrectString() {
        Animal animal = new Animal();
        String expectedFamilyString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyString = animal.getFamily();
        assertEquals(expectedFamilyString, actualFamilyString);
    }

}
