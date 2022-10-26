class Calculator {
    public static void main(String[] args) {
        try {
            int a = 5, b = 4; // we declare a variable
            System.out.println("Addition " + (a + b));
            System.out.println("Substraction " + (a - b));
            System.out.println("Multiplication " + (a * b));
            System.out.println("Modulo " + (a % b));
            System.out.println("Division " + (a / b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}