package frc.dfife;

import java.lang.invoke.MethodHandles;

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



    // *** CLASS CONSTRUCTOR ***
    public MyRobot()
    {

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