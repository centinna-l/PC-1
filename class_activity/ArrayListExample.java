import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String keyword = "yes";
        while (!keyword.equalsIgnoreCase("no")) {
            System.out.println("Input an entry");
            arrayList.add(sc.nextLine());
            System.out.println("More Items for the list?");
            keyword = sc.nextLine();
        }
        System.out.println("The list contains");
        for (String i : arrayList) {
            System.out.println(i);
        }
        sc.close();
    }
}
