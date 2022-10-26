public class Time {
    public static void main(String[] args) {
        // convert seconds to hrs, minutes and seconds
        int time = 50391;
        System.out.println((time / 3600) + " hours " + (time % 3600) / 60 + " minutes " + time % 60 + " seconds");
    }
}
