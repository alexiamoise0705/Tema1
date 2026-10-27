//meow chiar am incercat

package org.firstinspires.ftc.robotcontroller.external.samples.externalhardware;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

   @TeleOp (name= "TeleOpRobosap")
    public class TeleOpRobosap extends LinearOpMode {
       private DcMotor motor_left;
       private DcMotor motor_right;
       private Servo arm_pivot;
       private Servo claw;

       @Override
        public void runOpMode() {
           motor_left= hardwareMap.get(DcMotor.class, "motor_left");
           motor_right= hardwareMap.get(DcMotor.class, "motor_right");
           arm_pivot= hardwareMap.get(DcMotor.class, "arm_pivot");
           claw= hardwareMap.get(DcMotor.class, "claw");
       }




