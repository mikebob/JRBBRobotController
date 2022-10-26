package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion;
import org.firstinspires.ftc.robotcore.external.ExportToBlocks;

public class MyJavaSample extends BlocksOpModeCompanion {

    @ExportToBlocks (
            comment = "Here is a greeting for ya.",
            tooltip = "Greet a person or group.",
            heading = "Im a java heading! How amazing!",
            color = 155,
            parameterLabels = {"Recipient"}
    )

    public static String myJavaGreeting(String greetingRecipient) {
        return("Lets have some java " + greetingRecipient + "!");
    }

}