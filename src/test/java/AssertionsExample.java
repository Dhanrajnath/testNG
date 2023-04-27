import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver webDriver;

    @BeforeClass
    void setup() {
        System.out.println("AssertionsExample.setup");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void testURL() {
        String logo = webDriver.getCurrentUrl();
        Assert.assertEquals(logo, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 2)
    void homePageTitle() {
        String title = webDriver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
    }

    @AfterClass
    void tearDown() {
        webDriver.quit();
    }

}
