import java.util.Scanner;

public class QueFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter Deductions");
        double deductions = sc.nextDouble();
        System.out.println(salary > deductions ? "Ok" : "Crazy");
        sc.close();
    }
}
