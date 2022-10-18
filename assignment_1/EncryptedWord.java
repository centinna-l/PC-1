import java.util.Scanner;

// -------------------------------------------------------
// Assignment 1
//              Name     --> Student ID
// Written by: Jerry Joy --> 2203196
// For “Programming Concepts I” Section 87411 and 01211 – Fall 2022
// --------------------------------------------------------

/* Algorithm
 * 1. Create a new (encrypted) word with the first character replaced by the last character, and then
the last character replaced by the second character in the original word.
2.Use *** for the second to the second last characters.
3.Add the second to the second last characters in the original word, to the end of the new word. 
 */
class EncryptedWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Welcome to Encrypted Word Generator Program ======");
        System.out.println("Enter a word: ");
        String str = sc.nextLine().trim();
        System.out
                .println("Encrypted word is: " + str.substring(str.length() - 1) + "***" + str.charAt(1)
                        + str.substring(1, str.length() - 1)); // Substring to get form a new word
        System.out.println("==== Thank you for using Encrypted Word Generator Program ====");
        sc.close();
    }
}