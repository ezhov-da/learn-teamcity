package ru.ezhov.teamcity.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldPlusTwoNumberOneAndThree() {
        Calculator calculator = new Calculator();

        assertEquals(4, calculator.plus(1, 3));
    }
}