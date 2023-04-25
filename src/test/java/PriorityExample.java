import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    void testOne() {
        System.out.println("PriorityExample.testOne");
    }

    @Test(priority = 4, enabled = false)
    void testTwo() {
        System.out.println("PriorityExample.testTwo");
    }

    @Test(priority = 3)
    void testThree() {
        System.out.println("PriorityExample.testThree");
    }

    @Test(priority = 2)
    void testFour() {
        System.out.println("PriorityExample.testFour");
    }
}
