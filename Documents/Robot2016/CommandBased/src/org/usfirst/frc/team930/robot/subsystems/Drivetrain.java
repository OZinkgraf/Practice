
package org.usfirst.frc.team930.robot.subsystems;

import org.usfirst.frc.team930.robot.RobotMap;
import org.usfirst.frc.team930.robot.commands.Drive;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	TalonSRX L1 = new TalonSRX(RobotMap.L1Port);
	TalonSRX L2 = new TalonSRX(RobotMap.L2Port);
	TalonSRX L3 = new TalonSRX(RobotMap.L3Port);
	TalonSRX R1 = new TalonSRX(RobotMap.R1Port);
	TalonSRX R2 = new TalonSRX(RobotMap.R2Port);
	TalonSRX R3 = new TalonSRX(RobotMap.R3Port);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }
    
    public void setL1(double speed)
    {
    	L1.set(speed);
    }
    
    public void setL2(double speed)
    {
    	L2.set(speed);
    }
    
    public void setL3(double speed)
    {
    	L3.set(speed);
    }
    
    public void setR1(double speed)
    {
    	R1.set(speed);
    }
    
    public void setR2(double speed)
    {
    	R2.set(speed);
    }
    
    public void setR3(double speed)
    {
    	R3.set(speed);
    }
    public void setDriveSpeed(double drive, double turn)
    {
    	if(drive > turn)
    	{
    		L1.set(drive);
    		L2.set(drive);
    		L3.set(drive);
    		R1.set(drive);
    		R2.set(drive);
    		R3.set(drive);
    		
    	}
    	else
    	{
    		L1.set(turn);
    		L2.set(turn);
    		L3.set(turn);
    		R1.set(-turn);
    		R2.set(-turn);
    		R3.set(-turn);
    	}
    }
    
}

