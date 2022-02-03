// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.jwood.robot;

import java.lang.invoke.MethodHandles;

/**
 * Jwood's Code
 * @author jwood
 */
public class MyRobot
{
    private static final String fullClassName = MethodHandles.lookup().lookupClass().getCanonicalName();

    // *** STATIC INITIALIZATION BLOCK ***
    // This block of code is run first when the class is loaded
    static
    {
        System.out.println("Loading: " + fullClassName);
    }

    /**
     * This keeps track of the current state of the robot, from startup to auto, to teleop, etc.
     */
    public static enum RobotState
    {
        kNone,
        kRobotInit,
        kDisabledAfterRobotInit,
        kAutonomous,
        kDisabledAfterAutonomous,
        kTeleop,
        kDisabledAfterTeleop,
        kTest;
    }

    // *** CLASS & INSTANCE VARIABLES ***
    private static final TestMode test = new TestMode();
    private static final AutonomousMode autonomous = new AutonomousMode();
    private static final DisabledMode disabled = new DisabledMode();
    private static final TeleopMode teleop = new TeleopMode();

    private static RobotState robotState = RobotState.kNone;


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
        System.out.println("\n\n2022-Test-Code\n\n");
        robotState = RobotState.kRobotInit;
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
        robotState = RobotState.kAutonomous;

        autonomous.init();
    }

    /**
     * This method runs periodically (20ms) during autonomous mode.
     */
    public void autonomousPeriodic()
    {
        autonomous.periodic();
    }

    /**
     * This method runs one time when the robot exits autonomous mode.
     */
    public void autonomousExit()
    {
        autonomous.exit();
    }

    /**
     * This method runs one time when the robot enters teleop mode.
     */
    public void teleopInit()
    {
        robotState = RobotState.kTeleop;

        teleop.init();
        
    }

    /**
     * This method runs periodically (20ms) during teleop mode.
     */
    public void teleopPeriodic()
    {
        teleop.periodic();
    }

    /**
     * This method runs one time when the robot exits teleop mode.
     */
    public void teleopExit()
    {
        teleop.exit();
    }

    /**
     * This method runs one time when the robot enters test mode.
     */
    public void testInit()
    {
        robotState = RobotState.kTest;

        test.init();
    }

    /**
     * This method runs periodically (20ms) during test mode.
     */
    public void testPeriodic()
    {
        test.periodic();
    }

    /**
     * This method runs one time when the robot exits test mode.
     */
    public void testExit()
    {
        test.exit();
    }

    /**
     * This method runs one time when the robot enters disabled mode.
     */
    public void disabledInit()
    {
        if (robotState == RobotState.kRobotInit)
        {
            robotState = RobotState.kDisabledAfterRobotInit;
        }
        else if (robotState == RobotState.kAutonomous)
        {
            robotState = RobotState.kDisabledAfterAutonomous;
        }
        else if (robotState == RobotState.kTeleop)
        {
            robotState = RobotState.kDisabledAfterTeleop;
        }
        else if (robotState == RobotState.kTest)
        {
            robotState = RobotState.kDisabledAfterRobotInit;
        }

        disabled.init();
    }

    /**
     * This method runs periodically (20ms) during disabled mode.
     */
    public void disabledPeriodic()
    {
        disabled.periodic();
    }

    /**
     * This method runs one time when the robot exits disabled mode.
     */
    public void disabledExit()
    {
        disabled.exit();
    }

    /**
     * This method returns the current state of the robot
     * @return the robot state
     * @see RobotState
     */
    public static RobotState getRobotState()
    {
        return robotState;
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