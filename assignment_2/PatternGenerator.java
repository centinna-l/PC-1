import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Welcome to word Generator Program");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("1 - Square\n2 - Triangle\n3 - Quit");
        while (true) {
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("You have entered \'1' for \'Square'");
                System.out.println("Please enter the length of the side:");
                int side = sc.nextInt();
                for (int i = 1; i <= side; i++) {
                    for (int j = 1; j <= side; j++) {
                        if (i == j || j == side - i + 1) {
                            if (j == side - i + 1) {
                                System.out.print("/");
                            } else {
                                System.out.print("\\");
                            }

                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                System.out.println("The Perimeter of the Square is " + (side * side));
                System.out.println("Thank you for using the program");
                break;
            } else if (option == 2) {
                System.out.println("You have entered \'2' for \'Triangle'");
                System.out.println("Please enter the length of the side:");
                int side = sc.nextInt();
                for (int i = 0; i < side; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("The Perimeter of the Triangle is " + (side * 3));
                System.out.println("Thank you for using the program");
                break;
            } else if (option == 3) {
                System.out.println("See you next time!");
                break;
            } else {
                System.out.println("Invlaid choice try again");
                continue;
            }
        }
        sc.close();
    }
}
