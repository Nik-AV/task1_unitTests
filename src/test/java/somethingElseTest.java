import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.testng.Assert.*;

public class somethingElseTest {

    private Pen pen1, pen2, pen3;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() {

        pen1 = new Pen(10, 1.0, "Red");
        pen2 = new Pen(4, 0.5);
        pen3 = new Pen(3);
    }

    @Test
    public void testDoSomethingElse(){

        assertEquals(printColor(pen1), "Red");
        assertEquals(printColor(pen2), "BLUE");
        assertEquals(printColor(pen3), "BLUE");

    }

    public String printColor (Pen pen){

        System.out.close();
        PrintStream old = System.out;
        System.setOut(new PrintStream(output));
        pen.doSomethingElse();
        String str = output.toString().replaceAll("\n","");
        System.setOut(old);

        return str.substring(0, str.length() - 1);
    }
}