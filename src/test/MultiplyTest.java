package test;

import main.Multiply;
import main.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {

    @Test
    public void testMultiply(){
        Operation multiply = new Multiply();
        assertEquals(25.0, multiply.execute(5.0, 5.0), 0.0001);
    }
}
