
package org.usfirst.frc.team930.robot;


import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a demo program showing the use of the RobotDrive class.
 * The SampleRobot class is the base of a robot application that will automatically call your
 * Autonomous and OperatorControl methods at the right time as controlled by the switches on
 * the driver station or the field controls.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're inexperienced,
 * don't. Unless you know what you are doing, complex code will be much more difficult under
 * this system. Use IterativeRobot or Command-Based instead if you're new.
 */
public class Robot extends SampleRobot {
    Victor motor1;
    Joystick joystick;
    CANJaguar jag2;
    CANJaguar jag3;
    Compressor compressor;

    public Robot() {
        motor1 = new Victor(3);
        joystick = new Joystick(1);
        jag2 = new CANJaguar(2);
        jag3 = new CANJaguar(3);
        compressor = new Compressor(1);
        
        jag2.setPercentMode();
        jag2.enableControl();
        jag3.setPercentMode();
        jag3.enableControl();
    }

    public void autonomous() {

    }

    /**
     * Runs the motors with arcade steering.
     */
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
        	motor1.set(joystick.getY());
        	jag2.set(joystick.getY());
        	jag3.set(joystick.getY());
        	SmartDashboard.putBoolean("Pressure Switch Value: ", compressor.getPressureSwitchValue());
        }
    }

    /**
     * Runs during test mode
     */
    public void test() {
    }
}
