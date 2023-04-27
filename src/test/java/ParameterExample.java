import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    int x;
    int y;

    int z;

    @BeforeClass
    @Parameters({"a", "b", "sum"})
    void setup(int a, int b, int sum) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("ParameterExample.setup");
        x = a;
        y = b;
        z = sum;
    }

    @Test
    void add() {
        System.out.println("ParameterExample.add");
        Assert.assertEquals(x + y, z);
    }

}
