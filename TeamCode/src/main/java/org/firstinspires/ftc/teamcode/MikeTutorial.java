package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name="MikeTutorial")
public class MikeTutorial extends OpMode {
    DcMotor motor;

    public void init() {
        motor = hardwareMap.get(DcMotor.class, "FrontLeft");
    }

    public void loop() {
        motor.setPower(1);
    }
}
