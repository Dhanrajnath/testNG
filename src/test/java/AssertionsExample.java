import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        webDriver = new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest() {
        WebElement logo = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page!!!");
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
