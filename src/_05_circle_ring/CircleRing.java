package _05_circle_ring;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		Robot rob = new Robot();// 1. Make a new Robot

		rob.setX(150);// 2. Set your robot’s position to x=150 and y=200
		rob.setY(200);
		rob.penDown(); // 3. Put the robot's pen down

		rob.setSpeed(10);// 4. Set the robot’s speed to 10

		for (int i = 0; i < 360; i++) {

			// 5. Do everything below here 360 times (use i as the counter)

			rob.move(3);// 6. Move the robot 3 pixels

			rob.turn(1);// 7. Turn the robot 1 degree

			if (i % 20 == 0) {
				for (int j = 0; j < args.length; j++) {

					// 8. If the counter i is divisible by 20 (hint: use mod operator %)..

					rob.move(1);// 9. do steps 10 and 11 exactly 360 times (use j as the counter)
					rob.turn(1);
					// 10. Move the robot 1 pixel
				}
				// 11. Turn the robot 1 degree
			}
		}
	}
}
