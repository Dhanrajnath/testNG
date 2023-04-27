import org.testng.annotations.*;

public class FirstTestCaseAnnotations {

    @BeforeClass
    void beforeClass() {
        System.out.println("FirstTestCaseAnnotations.beforeClass");
    }

    @AfterClass
    void afterClass() {
        System.out.println("FirstTestCaseAnnotations.afterClass");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("FirstTestCaseAnnotations.beforeMethod");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("FirstTestCaseAnnotations.afterMethod");
    }

    @Test
    void test1() {
        System.out.println("FirstTestCaseAnnotations.test1");
    }

    @Test
    void test2() {
        System.out.println("FirstTestCaseAnnotations.test2");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("FirstTestCaseAnnotations.beforeTest");
    }

    @AfterTest
    void afterTest() {
        System.out.println("FirstTestCaseAnnotations.afterTest");
    }

}
