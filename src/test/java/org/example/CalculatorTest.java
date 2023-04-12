package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void intToRoman_withPositiveNumber_shouldReturnRomanNumeralString(){
        //Given
        int x = 546;

        //When
        String result = calc.intToRoman(x);

        //Then
        assertEquals("DXLVI", result);
    }

    @Test
    public void add_withPositiveNumber_shouldReturnPositiveInteger(){
        //Given
        int x = 3;
        int y = 7;

        //When
        int sum = calc.add(x, y);

        //Then
        assertEquals(10, sum);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 25", "-5, 25", "0, 0" })
    public void square_withNonZeroAndZeroNumbers_shouldReturnPositiveInteger(int value, int expected){
        //Given

        //When
        int result = calc.square(value);


        //Then
        assertEquals(expected, result);
    }

}
