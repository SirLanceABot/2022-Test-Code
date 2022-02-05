package frc.dfife;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

public class BoschMotor
{
    Counter motorCounter;

    public BoschMotor()
    {
        int encoderPort = 1;

        // Digital code for when you have a DIO adaptor
        // TODO Change to Digital Input but also needs a converter
        motorCounter = new Counter(new DigitalInput(encoderPort));

        /*
        // Analog code that might work
        AnalogTrigger analogTrigger = new AnalogTrigger(encoderPort);
        analogTrigger.setLimitsVoltage(3.5, 3.8); // might be pulse floor and less than pulse ceiling
        motorCounter = new Counter(analogTrigger);
        */
    }

    public int getEncoderValue()
    {
        // 174.9 counts should be one rotation
        return motorCounter.get();
    }
}
