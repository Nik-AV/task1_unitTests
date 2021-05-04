import org.testng.Assert;
import org.testng.annotations.Test;

public class getColorTest {

    @Test (dataProvider = "getColorSet", dataProviderClass = TestDataProvider.class)
    public void testGetColor(Pen pen, String expectedColor) {

        Assert.assertEquals(pen.getColor(), expectedColor);
    }
}