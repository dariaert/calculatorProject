package test;

import main.Divide;
import main.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivideTest {

    @Test
    public void testDivide(){
        Operation divide = new Divide();
        assertEquals(6.0, divide.execute(42.0, 7.0), 0.0001);
    }

    @Test
    public void testDivideByZero(){
        Operation divide = new Divide();
        assertThrows(ArithmeticException.class, () -> divide.execute(6.0, 0.0));
    }



}
