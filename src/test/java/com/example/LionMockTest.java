package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    private Feline feline;

    @Test
    public void lionCheckGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expectedQuantity = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualQuantity = lion.getKittens();
        assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void lionCheckGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

}
