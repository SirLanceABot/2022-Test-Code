package frc.dfife;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

public class BoschMotor
{
    Counter motorCounter;
    TalonSRX motorController;
    AnalogInput irSensor;

    public BoschMotor()
    {
        int encoderPort = 1;

        // Digital code for when you have a DIO adaptor
        // Example of how to use encoder on Bosch seat motor using a DIO converter kit
        // https://www.chiefdelphi.com/t/java-code-for-bosch-seat-motor-with-dio-kit/164325
        // TODO Change to Digital Input but also needs a converter
        motorCounter = new Counter(new DigitalInput(encoderPort));
        motorController = new TalonSRX(1);
        irSensor = new AnalogInput(0);

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

    public void resetEncoderCounter()
    {
        motorCounter.reset();
    }

    public double getIrSensorValue()
    {
        // SHARP 2Y0A21 has 10 cm to 80 cm range
        // TODO Get better IR sensor with shorter range
        return irSensor.getAverageVoltage();
    }

    public void setPercentOutput(double power)
    {
        motorController.set(ControlMode.PercentOutput, power);
    }
}
