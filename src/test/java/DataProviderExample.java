import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String password) {
        System.out.println("DataProviderExample.loginTest");
        System.out.println("email = " + email + ", password = " + password);
        Assert.assertEquals(email.split("@")[0], password);
    }

}
