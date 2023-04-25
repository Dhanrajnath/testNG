import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar() {
        System.out.println("DependencyExample.startCar");
//        Assert.assertEquals(1, 2);
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("DependencyExample.driveCar");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println("DependencyExample.stopCar");
    }

        @Test(dependsOnMethods = {"driveCar", "stopCar"})
//    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar() {
        System.out.println("DependencyExample.parkCar");
    }

}
