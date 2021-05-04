import org.testng.annotations.DataProvider;

public class TestDataProvider
{
    @DataProvider(name = "basePenSet")
    public static Object[][] basePenSet() {
        return new Object[][]{
                {new Pen(10, 1.0, "Red")},
                {new Pen(4, 3.5)},
                {new Pen(2)}
        };
    }

    @DataProvider(name = "getColorSet")
    public static Object[][] getColorSet() {
        return new Object[][]{
                {new Pen(10, 1.0, "Red"), "Red"},
                {new Pen(4, 3.5), "BLUE"},
                {new Pen(2), "BLUE"}
        };
    }

}
