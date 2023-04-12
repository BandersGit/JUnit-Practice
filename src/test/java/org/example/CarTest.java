package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarTest {

    @Mock
    Engine engine;

    @Test
    public void startUp_withGoodOilPressure_shouldStart(){
        //Given
        when(engine.checkOilPressure()).thenReturn(60);
        Car car = new Car("Volvo", engine);

        //When
        car.startUp();

        //Then
        assertTrue(car.isRunning());
    }

    @Test
    public void startUp_withLowOilPressure_shouldAbort(){
        //Given
        when(engine.checkOilPressure()).thenReturn(5);
        Car car = new Car("Volvo", engine);

        //When
        assertThrows(RuntimeException.class, car::startUp);

        //Then
        assertFalse(car.isRunning());
    }
}
