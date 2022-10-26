package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion;
import org.firstinspires.ftc.robotcore.external.ExportToBlocks;

public class SampleMyBlocks_v00 extends BlocksOpModeCompanion {

    @ExportToBlocks (
            comment = "Here is a greeting for ya.",
            tooltip = "Greet a person or group.",
            heading = "Im a heading! How amazing!",
            color = 155,
            parameterLabels = {"Recipient Name"}
    )
    public static String myGreeting(String greetingRecipient) {
        return("Lets have some Java " + greetingRecipient + "!");
    }

}
