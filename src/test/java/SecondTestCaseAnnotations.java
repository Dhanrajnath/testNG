import org.testng.annotations.*;

public class SecondTestCaseAnnotations {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("SecondTestCaseAnnotations.beforeSuite");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("SecondTestCaseAnnotations.afterSuite");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("SecondTestCaseAnnotations.beforeClass");
    }

    @AfterClass
    void afterClass() {
        System.out.println("SecondTestCaseAnnotations.afterClass");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("SecondTestCaseAnnotations.beforeMethod");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("SecondTestCaseAnnotations.afterMethod");
    }

    @Test
    void test3() {
        System.out.println("SecondTestCaseAnnotations.test3");
    }

    @Test
    void test4() {
        System.out.println("SecondTestCaseAnnotations.test4");
    }

}
