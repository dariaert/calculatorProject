package test;

import main.Operation;
import main.Add;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {

    @Test
    public void testAdd(){
        Operation add = new Add();
        assertEquals(5.0, add.execute(2.0, 3.0), 0.0001);
    }

}
