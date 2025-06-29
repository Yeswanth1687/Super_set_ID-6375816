Program: Calculator.java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
Program: JunitTestClass
CalculatorTest.java
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        int result = calc.add(5, 5);
        System.out.println("Testing Addition: 5 + 5 = " + result);
        assertEquals(10, result);
    }
}
