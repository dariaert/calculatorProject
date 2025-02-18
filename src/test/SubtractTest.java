package test;

import main.Operation;
import main.Subtract;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest {

    @Test
    public void testSubtract(){
        Operation substract = new Subtract();
        assertEquals(6.0, substract.execute(10.0, 4.0), 0.0001);
    }
}
