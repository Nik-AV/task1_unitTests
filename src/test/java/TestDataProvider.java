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


    @DataProvider(name = "isWorkSet")
    public static Object[][] isWorkSet() {
        return new Object[][]{
                {new Pen(10, 1.0, "Red"), true},
                {new Pen(0, 3.5), false},
                {new Pen(-1), false}
        };
    }

    @DataProvider(name = "writePositiveSet")
    public static Object[][] writePositiveSet() {
        return new Object[][]{
                {new Pen(10, 1.0, "Red"), "qwerty", "qwerty"},
                {new Pen(7, 3.5), "AB", "AB"},
                {new Pen(1), "1", "1"},
                {new Pen(4, 2), "123456", "1234"},
                {new Pen(1, 0.1), "1234567890abc", "1"},
                {new Pen(0, 3), "abc", ""}
        };
    }

    @DataProvider(name = "writeNegativeSet")
    public static Object[][] writeNegativeSet() {
        return new Object[][]{
                {new Pen(3, 1.5), "", ""},
                {new Pen(7, 0), "qwerty", ""},
                {new Pen(1, -1.5), "qwerty", ""},
                {new Pen(1), null, ""},

        };
    }
}
