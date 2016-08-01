package questions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q26 {

    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][] {
            {1}, {2}, {3}, {4}, {5}
        };
    }

    @Test(dataProvider = "dp")
    public void test1(Integer i) {
        System.out.println(i);
    }
}
