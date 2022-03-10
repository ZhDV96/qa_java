package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Mock
    private Feline feline;

    @Test
    public void lionCheckGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyCorrectString() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

}
