import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("TYPE A NUMBER FOR THE TRIANGLE");
        int x = k.nextInt();
        k.close();
        for (int a = 1; a < x; a++) {
            for (int e = 1; e <= x - a; e++) {
                System.out.print(" ");
            }
            for (int i = 0; i < a * 2 - 1; i++) {
                if (i == 0 || i == a * 2 - 2) {
                    System.out.print("*");
                } else if (i != 0 || i != a * 2 - 2) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int e = 0; e < x; e++) {
            System.out.print("* ");
            ;
        }
    }
}
