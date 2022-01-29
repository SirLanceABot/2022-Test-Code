package frc.igupta;

import java.lang.invoke.MethodHandles;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * test class for sensor
 * @author Ishaan Gupta
 */

public class SensorTest
{
    private static final int SENSOR_PORT = 2;

    private static DigitalInput sensor1 = new DigitalInput(SENSOR_PORT);

    public SensorTest()
    {
        System.out.println(this.getClass().getName() + ": Started Constructing");
        System.out.println(this.getClass().getName() + ": Finished Constructing");
    }

    public void sensorOutput()
    {
        System.out.println(!sensor1.get());
    }
}
