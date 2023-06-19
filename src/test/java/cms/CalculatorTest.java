package cms;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

        InvalidNumberException exception = Assertions.assertThrows(InvalidNumberException.class, () -> {
            calculator.add(2.0F, Float.NaN);
        });
        assertEquals("Invalid number: NaN", exception.getMessage(), "Exception message should match");
    }


    @Test
    void subtract() {
    }

    @Test
    void divide() {
    }

    @Test
    void multiply() {
    }
}