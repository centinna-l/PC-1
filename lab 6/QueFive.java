import java.util.Scanner;

class QueFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int x = 0;
        int y = 10;
        int z = 100;
        switch (msg.charAt(0)) {
            case 'a':
            case 'b':
                System.out.println("case1");
                x = (msg.equals("abc") ? (5 + y++) : (--y + z--));
                break;
            case 'c':
                System.out.println("case2");
                y /= 5;
            default:
                System.out.println("default");
        }
        System.out.println(x + " " + y + " " + z);
        sc.close();
    }
}