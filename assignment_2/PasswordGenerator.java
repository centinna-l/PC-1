import java.util.Scanner;

/**
 * We take the string,
 * 1. extract all the number and other characters in the string.
 * 2. use the second string varible and generate the password.
 * 3. contactinate the number to the end of the password generated
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String password = "";
        while (true) {
            System.out.println("Enter a word: (No to stop)");
            str = sc.nextLine();
            if (str.toLowerCase().matches("no")) {
                System.out.println("Thank you for using our program");
                break;
            }
            String numberOnly = str.replaceAll("[^0-9]", ""); // to extract all the numbers from the string
            String stringOnly = str.replaceAll("[0-9]", ""); // to extract all the characters apart from numbers.
            for (int i = 0; i < stringOnly.length(); i++) {
                if (stringOnly.charAt(i) == 'a' || stringOnly.charAt(i) == 'b' || stringOnly.charAt(i) == 'c'
                        || stringOnly
                                .charAt(i) == 'd') {
                    password += "#";
                } else if (stringOnly.charAt(i) == 'e' || stringOnly.charAt(i) == 'f' || stringOnly.charAt(i) == 'g'
                        || stringOnly
                                .charAt(i) == 'h') {
                    password += "@";
                } else if (stringOnly.charAt(i) == 'i' || stringOnly.charAt(i) == 'j' || stringOnly.charAt(i) == 'k'
                        || stringOnly
                                .charAt(i) == 'l') {
                    password += "?";
                } else if (stringOnly.charAt(i) == 'm' || stringOnly.charAt(i) == 'n' || stringOnly.charAt(i) == 'o'
                        || stringOnly
                                .charAt(i) == 'p') {
                    password += "%";
                } else if (stringOnly.charAt(i) == 'q' || stringOnly.charAt(i) == 'r' || stringOnly.charAt(i) == 's'
                        || stringOnly
                                .charAt(i) == 't') {
                    password += "&";
                } else if (stringOnly.charAt(i) == 'u' || stringOnly.charAt(i) == 'v' || stringOnly.charAt(i) == 'w'
                        || stringOnly
                                .charAt(i) == 'x') {
                    password += "$";
                } else if (stringOnly.charAt(i) == 'y' || stringOnly.charAt(i) == 'z') {
                    password += "!";
                } else {
                    password += "*";
                }
            }
            password += numberOnly;
            System.out.println("The generated password for " + str + " is " + password.trim());
            System.out.println("==============================================");
        }
        sc.close();
    }
}