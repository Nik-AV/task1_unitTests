import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class writeTest {

    private Pen pen1, pen2, pen3, pen4;

    @BeforeMethod
    public void setUp() {

        pen1 = new Pen(10, 1.0, "Red");
        pen2 = new Pen(3, 2);
        pen3 = new Pen(3);
        pen4 = new Pen(0);

    }

    @Test
    public void testWrite() {

        assertEquals(pen1.write("qwertyuiop"), "qwertyuiop");
        assertEquals(pen2.write("abcd"), "abc");
        assertEquals(pen2.write("123"), "");
        assertEquals(pen3.write(""), "");
        assertEquals(pen3.write("zxcvbn"), "zxc");
        assertEquals(pen4.write("zxc"), "");

    }
}