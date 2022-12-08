/*
 * 
 * Final Exam
 * Jerry Joy
 * 2203196
 */

import java.util.Scanner;

public class RobotTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model;
        int location, speed;
        System.out.println("Please enter the model of the first robot:");
        model = sc.nextLine();
        System.out.println("Please enter the location of the first robot:");
        location = sc.nextInt();
        if (location < 0) {
            location = 0; // we force the location to be 0, to avoid errors in the program
        }
        System.out.println("Please enter the speed of the first robot:");
        speed = sc.nextInt();
        Robot robot1 = new Robot(model, location, speed);
        // for the second robot
        String junk = sc.nextLine(); // this is to remove the \n
        System.out.println("Please enter the model of the second robot:");
        model = sc.nextLine();
        System.out.println("Please enter the location of the second robot:");
        location = sc.nextInt();
        if (location < 0) {
            location = 0; // we force the location to be 0, to avoid errors in the program
        }
        System.out.println("Please enter the speed of the second robot:");
        speed = sc.nextInt();
        Robot robot2 = new Robot(model, location, speed);

        // checking their states
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
        Robot left, right;
        if (robot1.getLocation() > robot2.getLocation()) {
            left = robot2;
            right = robot1;
        } else {
            left = robot1;
            right = robot2;
        }
        // checking their states
        right.turnAround();
        System.out.println(left.toString());
        System.out.println(right.toString());
        left.go();
        right.go();
        System.out.println(left.toString());
        System.out.println(right.toString());
        while (left.getLocation() != right.getLocation() && left.getLocation() >= 0 &&
                right.getLocation() >= 0) {
            left.move();
            right.move();
            System.out.println(left.toString());
            System.out.println(right.toString());
            if (left.getLocation() == right.getLocation()) {
                break;
            }
        }
        System.out.println("Boom");
        System.out.println(junk);
        sc.close();
    }
}
