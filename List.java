import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class List {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int i = a; i <= b; i++) {
            if (checkPrime(i)) {
                int reverse = 0;
                int num = i;
                while (num != 0) {
                    int remainder = num % 10;
                    reverse = reverse * 10 + remainder;
                    num = num / 10;
                }
                if (checkPrime(reverse)) {
                    // System.out.println(num);
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        in.close();
    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int j = 2; j <= Math.sqrt(n); j++)
            if (n % j == 0) {
                count++;
            }
        return count == 0 ? true : false;
    }
}