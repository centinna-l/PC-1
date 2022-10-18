import java.util.Scanner;

public class QueTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double savings = sc.nextDouble();
        double expense = sc.nextDouble();
        if (savings - expense < 0) {
            System.out.println("Bankrupt");
        } else {
            savings -= expense;
            expense = 0;
            System.out.println("Solvent");
            System.out.println("Savings: " + savings);
            System.out.println("Expense: " + expense);
        }
        sc.close();
    }
}
