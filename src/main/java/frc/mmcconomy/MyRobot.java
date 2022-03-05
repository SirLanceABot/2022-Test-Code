package frc.mmcconomy;

import java.lang.invoke.MethodHandles;

import javax.lang.model.util.ElementScanner6;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxAnalogSensor;
import com.revrobotics.SparkMaxLimitSwitch;
import com.revrobotics.SparkMaxLimitSwitch.Type;
import com.revrobotics.AnalogInput;

import edu.wpi.first.wpilibj.AnalogEncoder;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;

public class MyRobot
{
    private static final String fullClassName = MethodHandles.lookup().lookupClass().getCanonicalName();

    // *** STATIC INITIALIZATION BLOCK ***
    // This block of code is run first when the class is loaded
    static
    {
        System.out.println("Loading: " + fullClassName);
    }

    // *** CLASS & INSTANCE VARIABLES ***
    private static final DigitalInput SWITCH = new DigitalInput(0);
    private static final TalonSRX TALON = new TalonSRX(0);
    private static final Joystick joystick = new Joystick(0);

    private static final CANSparkMax NEO = new CANSparkMax(7, com.revrobotics.CANSparkMaxLowLevel.MotorType.kBrushless);
    private final RelativeEncoder NEOE;
    private final SparkMaxLimitSwitch NEOLS;
    private final SparkMaxLimitSwitch NEOLStwo;
    private final AnalogEncoder JOE = new AnalogEncoder(0);
    // *** CLASS CONSTRUCTOR ***
    public MyRobot()
    {
        //Talon code
        // TALON.configSelectedFeedbackSensor(FeedbackDevice.Analog);
        // // TALON.configForwardSoftLimitThreshold(80, 0);
        // TALON.configReverseSoftLimitThreshold(80, 0);
        // // TALON.configForwardSoftLimitEnable(true, 0);
        // TALON.configReverseSoftLimitEnable(true, 0);
        //CanSparkMax Code
        NEOLS = NEO.getForwardLimitSwitch(Type.kNormallyOpen);
        NEOLS.enableLimitSwitch(true);
        NEOLStwo = NEO.getReverseLimitSwitch(Type.kNormallyOpen);
        NEOLStwo.enableLimitSwitch(true);
        NEOE = NEO.getEncoder();
        NEOE.setPosition(0);
    }

    /**
     * This method runs when the robot first starts up.
     */
    public void robotInit()
    {   
        displayHeader();
    }

    /**
     * This method runs periodically (20ms) while the robot is powered on.
     */
    public void robotPeriodic()
    {

    }

    /**
     * This method runs one time when the robot enters autonomous mode.
     */
    public void autonomousInit()
    {

    }

    /**
     * This method runs periodically (20ms) during autonomous mode.
     */
    public void autonomousPeriodic()
    {

    }

    /**
     * This method runs one time when the robot exits autonomous mode.
     */
    public void autonomousExit()
    {

    }

    /**
     * This method runs one time when the robot enters teleop mode.
     */
    public void teleopInit()
    {
        
    }

    /**
     * This method runs periodically (20ms) during teleop mode.
     */
    public void teleopPeriodic()
    {
        // System.out.println(TALON.getSelectedSensorPosition());
        if(joystick.getRawButton(1))
        {
            // System.out.println(TALON.getSelectedSensorPosition());
            // TALON.set(ControlMode.PercentOutput, .5);
            NEO.set(.1);
        }
        else if(joystick.getRawButton(2))
        {
            
            // TALON.set(ControlMode.PercentOutput, -.5);
            NEO.set(-.1);
        }
        else
        {
            // TALON.set(ControlMode.PercentOutput, 0);
            NEO.set(0);
        }
        // System.out.println(SWITCH.get());
       
    }

    /**
     * This method runs one time when the robot exits teleop mode.
     */
    public void teleopExit()
    {
        
    }

    /**
     * This method runs one time when the robot enters test mode.
     */
    public void testInit()
    {

    }

    /**
     * This method runs periodically (20ms) during test mode.
     */
    public void testPeriodic()
    {
        System.out.println(SWITCH.get());
    }

    /**
     * This method runs one time when the robot exits test mode.
     */
    public void testExit()
    {

    }

    /**
     * This method runs one time when the robot enters disabled mode.
     */
    public void disabledInit()
    {

    }

    /**
     * This method runs periodically (20ms) during disabled mode.
     */
    public void disabledPeriodic()
    {

    }

    /**
     * This method runs one time when the robot exits disabled mode.
     */
    public void disabledExit()
    {

    }

    /**
     * This method displays a header to alert the user what code is loading.
     */
    private void displayHeader()
    {
        String name = this.getClass().getPackageName().toUpperCase();
        String title = String.format("\n\n  *****  %s * %s * %s * %s * %s  *****\n\n", name, name, name, name, name);

        System.out.println(title);
        System.out.println(title);
        System.out.println(title);
        System.out.println(title);
        System.out.println(title);
    }

}