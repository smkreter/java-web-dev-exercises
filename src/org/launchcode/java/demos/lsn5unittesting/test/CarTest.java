package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void testInitialGasTank() {
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testPostDriveGasTank() {
        test_car.drive(250);
        assertEquals(5, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testDrivingTooFar() {
        test_car.drive(600);
        assertEquals(0, test_car.getGasTankLevel(), .001);
        assertEquals(500, test_car.getOdometer(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    public void testTankSize() {
        //assertEquals(Error, test_car.setGasTankLevel(650));
    }

}
