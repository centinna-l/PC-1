import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your String");
        String str = sc.nextLine();
        System.out.println(str.replaceAll("hate", "love"));
        sc.close();
    }
}
