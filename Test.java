import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = "Winter is coming.";
        System.out.println(str.substring(0, str.indexOf(" ") + 1).toUpperCase()
                + str.substring(str.indexOf(" ")).toLowerCase());

        console.close();

    }
}