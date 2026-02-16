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

    // TESTES DE OPERAÇÕES BÁSICAS

    @Test
    void add_DoisNumerosPositivos_RetornaSomaCorreta() {
        double valueExpected = 4;

        double result = scientificCalculator.add(2, 2);

        assertEquals(valueExpected, result);
    }

    @Test
    void subtract_DoisNumeros_RetornaSubtracaoCorreta() {
        // Arrange/Setup
        double valueExpected = 5;

        // Act/Execute
        double result = scientificCalculator.subtract(15, 10);

        // Assert
        assertEquals(valueExpected, result);
    }

    // TESTES DE FUNÇÕES CIENTÍFICAS E PRECISÃO

    @Test
    void squareRoot_NumeroPositivo_RetornaRaizExata() {
        // Arrange/Setup
        double valueExpected = 9;

        // Act/Execute
        double result = scientificCalculator.squareRoot(81);

        // Assert
        assertEquals(valueExpected, result);
    }

    @Test
    void log_EntradaValida_DeveTerPrecisaoDecimal() {
        // Arrange/Setup
        double valueExpected = 1.6094;

        // Act/Execute
        double result = scientificCalculator.log(5.0);

        // Assert
        assertEquals(valueExpected, result, 0.0001);
    }

    @Test
    void sin_NoventaGraus_RetornaUm() {
        // Arrange/Setup
        double valueExpected = 1.0;

        // Act/Execute
        double result = scientificCalculator.sin(90.0);

        // Assert
        assertEquals(valueExpected, result, 0.0001);
    }

    // TESTES DE ERRO E EXCEÇÕES

    @Test
    void squareRoot_NumeroNegativo_LancaExcecaoIllegalArgumentException() {
        // Arrange/Setup
        String valueExpected = "Negative number";

        // Act/Execute
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    scientificCalculator.squareRoot(-81);
                },
                "Deve lançar IllegalArgumentException quando receber um numero negativo.");

        // Assert
        assertEquals(valueExpected, exception.getMessage());
    }

    @Test
    void divide_PorZero_LancaExcecaoIllegalArgumentException() {
        // Arrange/Setup
        String valueExpected = "Division by zero";

        // Act/Execute
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    scientificCalculator.divide(5, 0);
                },
                "Deve lançar IllegalArgumentException quando receber o valor 0.");

        // Assert
        assertEquals(valueExpected, exception.getMessage());
    }
}