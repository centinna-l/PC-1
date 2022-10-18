import java.util.Scanner;

public class QueFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp > 90 || temp <= 55) {
            System.out.println("Visit a neighbor");
        } else if (temp > 80 && temp <= 90) {
            System.out.println("Turn on Air Conditioning");
        } else if (temp > 70 && temp <= 80) {
            System.out.println("Do nothing");
        } else if (temp > 55 && temp <= 70) {
            System.out.println("Turn on heat");
        } else {
            System.out.println("I think you should sleep");
        }
        sc.close();
    }
}
