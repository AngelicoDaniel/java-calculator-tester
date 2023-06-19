package cms;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void close() {
        System.out.println("At the end of all tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Before each test");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add")
    void add() {
        assertEquals(5.0, calculator.add(2.0F, 3.0F), "Addition of positive numbers");
        assertEquals(-5.0, calculator.add(-2.0F, -3.0F), "Addition of negative numbers");
        assertEquals(0.0, calculator.add(0.0F, 0.0F), "Addition of zeros");

        assertThrows(InvalidNumberException.class, () -> calculator.add(2.0F, Float.NaN), "Numbers must not be NaN");
    }

    @Test
    @DisplayName("Subtract")
    void subtract() {
        assertEquals(2.0, calculator.subtract(5.0F, 3.0F), "Subtraction of positive numbers");
        assertEquals(-1.0, calculator.subtract(2.0F, 3.0F), "Subtraction of negative numbers");
        assertEquals(0.0, calculator.subtract(5.0F, 5.0F), "Subtraction of equal numbers");
    }

    @Test
    @DisplayName("Multiply")
    void multiply() {
        assertEquals(6.0, calculator.multiply(2.0F, 3.0F), "Multiplication of positive numbers");
        assertEquals(-6.0, calculator.multiply(2.0F, -3.0F), "Multiplication of positive and negative numbers");
        assertEquals(0.0, calculator.multiply(5.0F, 0.0F), "Multiplication by zero");
    }

    @Test
    @DisplayName("Divide")
    void divide() {
        assertEquals(2.0, calculator.divide(6.0F, 3.0F), "Division of positive numbers");
        assertEquals(-2.0, calculator.divide(6.0F, -3.0F), "Division of positive and negative numbers");

        assertThrows(InvalidNumberException.class, () -> calculator.divide(999, 0), "Can't divide by zero");
    }

}
