public class FormatSpecifier {
    public static void main(String[] args) {
        System.out.printf("--------------------------------%n");
        System.out.printf(" Java's Primitive Types         %n");
        System.out.printf(" (String printf example)        %n");

        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        System.out.printf("--------------------------------%n");

        System.out.printf("| %-10s | %-8s | %4s |%n", "Floating", "double", "0064");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Floating", "float", "0032");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "long", "0064");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "int", "0032");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "char", "0016");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "short", "0016");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Integral", "byte", "0008");
        System.out.printf("| %-10s | %-8s | %4s |%n", "Boolean", "boolean", "0001");

        System.out.printf("--------------------------------%n");
    }
}
