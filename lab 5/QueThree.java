import java.util.Scanner;

public class QueThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num > 0 ? "Positive" : "Not Positive");
        sc.close();
    }
}
