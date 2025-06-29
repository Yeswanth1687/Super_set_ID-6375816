import org.junit.Test;
import static org.junit.Assert.*;

public class MyLogicTest {

    MyLogic logic = new MyLogic();

    @Test
    public void testAllAssertions() {
   
        assertEquals(10, logic.add(7, 3));

     
        assertTrue(logic.isPositive(5));

     
        assertFalse(logic.isPositive(-1));

      
        assertNull(logic.returnNull());

        
        assertNotNull(logic.returnObject());

       
        assertEquals("JUnit", logic.echo("JUnit"));

       
        assertTrue(logic.echo("hello").startsWith("h"));

        
        assertFalse(logic.isStringEmpty("Not Empty"));

       
        Integer x = 100;
        assertSame(x, logic.sameReference(x));

        
        assertNotSame(new String("a"), new String("a"));
    }
}
