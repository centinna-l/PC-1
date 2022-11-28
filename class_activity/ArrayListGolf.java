import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGolf {
    public static void displayArrayList(ArrayList<Integer> arrayList, double average) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i : arrayList) {
            System.out
                    .println(decimalFormat.format(i) + " differs from average by " + decimalFormat.format(i - average));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("This program reads golf scores and shows\nhow much each differs from the average");
        System.out.println("Enter Golf Scores");
        System.out.println("Enter a list of non-negative numbers");
        System.out.println("Mark the end of the list with a negative number");
        int score = 0;
        // Get user input
        while (score >= 0) {
            score = sc.nextInt();
            if (score < 0) {
                break;
            }
            arrayList.add(score);
        }

        double average = 0;
        for (int i : arrayList) {
            average += i;
        }
        average = average / arrayList.size();
        System.out.println("Average of " + arrayList.size() + " score =  " + decimalFormat.format(average));
        displayArrayList(arrayList, average);
        sc.close();
    }
}
