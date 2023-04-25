import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("TEST2:opening browser");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("TEST2:This is search customer test");
//        Assert.assertEquals(1, 2 - 2);
    }

    @Test(priority = 2)
    void addCustomer() {
        System.out.println("TEST2:This is add customer test");
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("TEST2:closing browser");
    }

}
