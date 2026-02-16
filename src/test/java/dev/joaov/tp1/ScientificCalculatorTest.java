package dev.joaov.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator;

    @BeforeEach
    void setup() {
        scientificCalculator = new ScientificCalculator();
    }

    @Test
    void testAddition() {
        double valueExpected = 4;

        double result = scientificCalculator.add(2, 2);

        assertEquals(valueExpected, result);
    }

    @Test
    void deveSubtrairValorCorretamente() {
        // Arrange/Setup
        double valueExpected = 5;

        // Act/Execute
        double result = scientificCalculator.subtract(15, 10);

        // Assert
        assertEquals(valueExpected, result);
    }

    @Test
    void testSquareRootPositive() {
        // Arrange/Setup
        double valueExpected = 9;

        // Act/Execute
        double result = scientificCalculator.squareRoot(81);

        // Assert
        assertEquals(valueExpected, result);
    }
}