import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class getColorTest {

    private Pen pen1, pen2, pen3;

    @BeforeMethod
    public void setUp() {

        pen1 = new Pen(10, 1.0, "Red");
        pen2 = new Pen(4, 0.5);
        pen3 = new Pen(3);
    }

    @Test
    public void testGetColor() {

        assertEquals(pen1.getColor(), "Red");
        assertEquals(pen2.getColor(), "BLUE");
        assertEquals(pen3.getColor(), "BLUE");

    }
}