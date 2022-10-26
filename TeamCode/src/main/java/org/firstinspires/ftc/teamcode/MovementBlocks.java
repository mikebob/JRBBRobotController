package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder;

import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion;
import org.firstinspires.ftc.robotcore.external.ExportToBlocks;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class MovementBlocks extends BlocksOpModeCompanion {

    @ExportToBlocks (
            comment = "Move forward",
            tooltip = "How far would you like to go forward??",
            heading = "Lets go forward!",
            parameterLabels = {"Distance (inches)"}
    )
    public static void forward(Double distance)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .forward(distance)
                .build();

        drive.followTrajectory(myTrajectory);
    }

    @ExportToBlocks (
            comment = "Move backward",
            tooltip = "How far would you like to go backward??",
            heading = "Lets go backward!",
            parameterLabels = {"Distance (inches)"}
    )
    public static void backward(Double distance)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .back(distance)
                .build();

        drive.followTrajectory(myTrajectory);
    }

    @ExportToBlocks (
            comment = "Strafe left",
            tooltip = "How far would you like to strafe left??",
            heading = "Lets strafe left!",
            parameterLabels = {"Distance (inches)"}
    )
    public static void strafeLeft(Double distance)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .strafeLeft(distance)
                .build();

        drive.followTrajectory(myTrajectory);
    }

    @ExportToBlocks (
            comment = "Strafe right",
            tooltip = "How far would you like to strafe right??",
            heading = "Lets strafe right!",
            parameterLabels = {"Distance (inches)"}
    )
    public static void strafeRight(Double distance)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .strafeRight(distance)
                .build();

        drive.followTrajectory(myTrajectory);
    }

    // Robot moves to the specified coordinates.
    // The robot maintains the heading it starts at throughout the trajectory
    // So, if you start at a 90 degree angle, it will keep that angle the entire path.
    @ExportToBlocks (
            comment = "Move to x, y coordinate on playing field",
            tooltip = "Where would you like to strafe to??",
            heading = "Lets strafe to your coordinate!",
            parameterLabels = {"Field X Coordinate", "Field Y Coordinate"}
    )
    public static void moveToCoordinate(Double x, Double y)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .strafeTo(new Vector2d(x, y))
                .build();

        drive.followTrajectory(myTrajectory);
    }

    // Robot moves to the specified coordinates while spline
    // interpolating between the start heading and a specified end heading.
    @ExportToBlocks (
            comment = "Move to x, y coordinate on playing field and rotate by radian",
            tooltip = "Where would you like to move to??",
            heading = "Lets move to your coordinate and rotate!",
            parameterLabels = {"Field X Coordinate", "Field Y Coordinate", "Radian (degrees)"}
    )
    public static void moveToCoordinateHeading(Double x, Double y, Double radian)  {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
            .lineToSplineHeading(new Pose2d(x, y, Math.toRadians(radian)))
            .build();

        drive.followTrajectory(myTrajectory);
    }

}
