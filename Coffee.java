public class Coffee {
    static final int limit = 1000;

    public static void main(String[] args) {
        int caffineContent = 34;
        System.out
                .println("It will around " + (int) Math.floor(limit / caffineContent) + " cups of coffee to kill you!");
    }
}
