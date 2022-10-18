import java.util.Scanner;

// -------------------------------------------------------
// Assignment 1
//              Name     --> Student ID
// Written by: Jerry Joy --> 2203196
// For “Programming Concepts I” Section 87411 and 01211 – Fall 2022
// --------------------------------------------------------

/**
 * Algorithm
 * We have to calculate the equation
 * r=(K%n)c
 * where c=(a+b)2 ==> (a+b)2 = a2+b2+2ab
 * 
 */

class CalculateFormulae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 50; // value of k
        System.out.println("Hello Dear Scientist");
        System.out.println("Please enter the following values");
        System.out.print("a: ");
        int a = sc.nextInt(); // Value of a
        System.out.print("b: ");
        int b = sc.nextInt(); // Value of b
        System.out.print("n: ");
        int n = sc.nextInt(); // Value of n
        System.out.println("");
        int c = (a * a) + (b * b) + (2 * a * b); // value of c
        if (n > 0 && n <= 20) {
            int r = (k % n) * c; // Calculation of the value of r
            System.out.println("Output is: " + r);
            System.out.println("Thank you for using our program");
        } else {
            System.out.println("Value of n cannot be outside the range of 1 to 20");
        }

        sc.close();
    }
}