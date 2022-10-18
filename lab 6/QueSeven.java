public class QueSeven {
    public static void main(String[] args) {
        int x = -555;
        boolean isNegative = (x < 0);
        if (isNegative) {
            x = 100;
            if (isNegative)
                System.out.println("no");
            else
                System.out.println("yes");
        } else
            System.out.println("maybe");
    }
}
