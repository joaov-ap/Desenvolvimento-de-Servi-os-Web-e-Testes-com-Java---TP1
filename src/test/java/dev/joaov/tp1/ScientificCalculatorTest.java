package dev.joaov.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void testAddition() {
        double valueExpected = 4;

        ScientificCalculator sc = new ScientificCalculator();
        double result = sc.add(2, 2);

        assertEquals(valueExpected, result);
    }

    @Test
    void deveSubtrairValorCorretamente() {
        // Arrange/Setup
        double valueExpected = 5;

        ScientificCalculator sc = new ScientificCalculator();

        // Act/Execute
        double result = sc.subtract(15, 10);

        // Assert
        assertEquals(valueExpected, result);
    }
}