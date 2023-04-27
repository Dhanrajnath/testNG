import org.testng.annotations.Test;

public class GroupingTestExample {

    @Test(groups = {"sanity"})
    void test1() {
        System.out.println("GroupingTestsExample.test1");
    }

    @Test(groups = {"sanity"})
    void test2() {
        System.out.println("GroupingTestsExample.test2");
    }

    @Test(groups = {"regression"})
    void test3() {
        System.out.println("GroupingTestsExample.test3");
    }

    @Test(groups = {"regression"})
    void test4() {
        System.out.println("GroupingTestsExample.test4");
    }

    @Test(groups = {"sanity", "regression"})
    void test5() {
        System.out.println("GroupingTestsExample.test5");
    }

    @Test(groups = {"sanity"})
    void test6() {
        System.out.println("GroupingTestsExample.test6");
    }

}
