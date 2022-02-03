package frc.jwood.robot;

import java.lang.invoke.MethodHandles;

import frc.jwood.constants.Port;
import frc.jwood.controls.DriverController;
import frc.jwood.controls.OperatorController;
import frc.jwood.shuffleboard.DriverControllerTab;
import frc.jwood.shuffleboard.MainShuffleboard;
import frc.jwood.shuffleboard.OperatorControllerTab;

public class RobotContainer 
{
    private static final String fullClassName = MethodHandles.lookup().lookupClass().getCanonicalName();

    // *** STATIC INITIALIZATION BLOCK ***
    // This block of code is run first when the class is loaded
    static
    {
        System.out.println("Loading: " + fullClassName);
    }


    // *** CLASS & INSTANCE VARIABLES ***
    public static final DriverController DRIVER_CONTROLLER = new DriverController(Port.Controller.DRIVER);
    public static final OperatorController OPERATOR_CONTROLLER = new OperatorController(Port.Controller.OPERATOR);

    public static final MainShuffleboard MAIN_SHUFFLEBOARD = new MainShuffleboard();
    public static final DriverControllerTab DRIVER_CONTROLLER_TAB = new DriverControllerTab();
    public static final OperatorControllerTab OPERATOR_CONTROLLER_TAB = new OperatorControllerTab();


    // *** CLASS CONSTRUCTOR ***
    private RobotContainer()
    {
    
    }


    // *** CLASS & INSTANCE METHODS ***

        
}

