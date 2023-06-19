package cms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
    void add() {
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