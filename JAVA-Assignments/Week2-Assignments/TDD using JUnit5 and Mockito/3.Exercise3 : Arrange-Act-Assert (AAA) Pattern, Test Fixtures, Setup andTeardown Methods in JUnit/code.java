Calculator.java;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
CalculatorTest.java:
Program:
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: New Calculator created");
    }

  
    @After
    public void tearDown() {
        System.out.println("Teardown: Test complete\n");
    }

    @Test
    public void testAddition() {
      
        int a = 5, b = 3;

     
        int result = calculator.add(a, b);

    
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
     
        int a = 10, b = 4;

   
        int result = calculator.subtract(a, b);

   
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
     
        int a = 6, b = 7;

   
        int result = calculator.multiply(a, b);

      
        assertEquals(42, result);
    }

    @Test
    public void testDivision() {
     
        int a = 20, b = 5;

      
        int result = calculator.divide(a, b);

        
        assertEquals(4, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
     
        int a = 10, b = 0;

      
        calculator.divide(a, b);
       
    }
}
