import java.util.Scanner;

public class QueOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number");
        if (num > 100) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
        sc.close();
    }
}
