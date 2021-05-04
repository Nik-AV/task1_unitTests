import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.testng.Assert.*;

public class somethingElseTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() {

        System.setOut(new PrintStream(this.output));
    }

    @Test (dataProvider = "basePenSet", dataProviderClass = TestDataProvider.class)
    public void testDoSomethingElse(Pen pen){

        pen.doSomethingElse();
        Assert.assertNotEquals(output.toString().trim(), null);

    }
}