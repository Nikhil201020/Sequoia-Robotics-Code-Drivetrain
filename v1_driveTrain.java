//
//  DriveTrain.java
//  Robotics
//
//  Created by Nikhil Rasiah on 9/22/26.
//
// IMPORTS FROM FTC
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class DriveTrain extends LinearOpMode {

  @Override
  public void runOpMode() {
    // Initialize hardware variables (motors)
    DcMotor frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeft");
    DcMotor backLeftMotor = hardwareMap.get(DcMotor.class, "backLeft");
    DcMotor frontRightMotor = hardwareMap.get(DcMotor.class, "frontRight");
    DcMotor backRightMotor = hardwareMap.get(DcMotor.class, "backRight");
  
    frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    frontRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    backRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
  
    waitForStart();

    while (opModeIsActive()) {
      
    }
  }

  


  
  
}
