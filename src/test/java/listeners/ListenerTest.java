package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.PostActionsUsingListeners.class)  ---> not needed if we configure using testNG xml file
public class ListenerTest {

    @Test
    void test1() {
        System.out.println("ListenerTest.test1");
    }

    @Test
    void test2() {
        System.out.println("ListenerTest.test2");
        Assert.assertEquals(1, 2);
    }

    @Test
    void test3() {
        System.out.println("ListenerTest.test3");
        throw new SkipException("skipped test");
    }

}
