public class Pi {
    public static void main(String[] args) {
        double PI = 0;
        for (int i = 10000; i > 0; i--) {
            PI += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
            if (i == 1) { // When at last number in series, multiply by 4
                PI *= 4;
                System.out.println(PI); // Print result
            }
        }
    }
}
