import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class getColorTest {

    @Test (dataProvider = "getColorSet", dataProviderClass = TestDataProvider.class)
    public void testGetColor(Pen pen, String expectedColor) {

        Assert.assertEquals(pen.getColor(), expectedColor);
    }
}