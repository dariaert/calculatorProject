package test;

import main.java.core.Operation;
import main.java.operations.Subtract;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest {

    @Test
    public void testSubtract(){
        Operation substract = new Subtract();
        assertEquals(6.0, substract.execute(10.0, 4.0), 0.0001);
    }
}
