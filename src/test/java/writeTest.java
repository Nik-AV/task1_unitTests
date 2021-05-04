import org.testng.Assert;
import org.testng.annotations.Test;


public class writeTest {

    @Test (dataProvider = "isWorkSet", dataProviderClass = TestDataProvider.class)
    public void tesIsWork(Pen pen, boolean expectedResult) {

        Assert.assertEquals(pen.isWork().booleanValue(), expectedResult);
    }

    @Test (dataProvider = "writePositiveSet", dataProviderClass = TestDataProvider.class)
    public void testPositiveWrite(Pen pen, String inputString, String expectedResult) {

        Assert.assertEquals(pen.write(inputString), expectedResult);
    }

    @Test (dataProvider = "writeNegativeSet", dataProviderClass = TestDataProvider.class)
    public void testNegativWrite(Pen pen, String inputString, String expectedResult) {

        Assert.assertEquals(pen.write(inputString), expectedResult);
    }

}