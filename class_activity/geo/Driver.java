package geo;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static double calculateDistace(GPS g1, GPS g2) {
        double distance = 0.0;
        distance = Math.sqrt(Math.pow(g1.getX() - g2.getX(), 2) - Math.pow(g1.getY() - g2.getY(), 2));
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GPS> arrayList = new ArrayList<GPS>();
        String keyword = "yes";
        while (!keyword.equalsIgnoreCase("no")) {
            System.out.println("Enter the coordinates with x, y, time");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int t = sc.nextInt();
            String junk = sc.nextLine(); // get rid of \n

            GPS gps = new GPS(x, y, t);
            arrayList.add(gps);
            System.out.println("Add new points (yes or no?)");
            keyword = sc.nextLine();

        }
        double[] array = new double[arrayList.size()];
        int totalTime = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            array[i] = calculateDistace(arrayList.get(i), arrayList.get(i + 1));
            totalTime += arrayList.get(i + 1).getT();
        }
        double distance = 0.0;

        for (double i : array) {
            distance += i;
        }

        System.out.println("Total distance is  " + (distance * 0.1) + " miles");
        System.out.println("Total time taken is  " + totalTime / (60 * 60) + " hr");
        sc.close();
    }
}
