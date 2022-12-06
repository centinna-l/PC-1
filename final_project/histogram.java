package final_project;

import java.util.*;

public class histogram {

    public static int getUniqueValues(int[] array) {
        int count = 1;

        // Pick all elements one by one
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (array[i] == array[j])
                    break;

            // If not printed earlier, then print it
            if (i == j)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 5, 7, 11, 7, 7, 9, 10, 3, 7, 4, 5, 6 };
        // Count the distinct values and store it in an array

        // We sort both the orignal array and the unique array.
        Arrays.sort(array);
        int[] unique = Arrays.stream(array).distinct().toArray();
        Arrays.sort(unique);
        int count = unique.length;
        int[][] histogram = new int[count][2];
        for (int i = 0; i < unique.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (unique[i] == array[j]) {
                    histogram[i][0] = unique[i];
                    histogram[i][1]++;
                }
            }
        }

        for (int i = 0; i < histogram.length; i++) {
            System.out.print(histogram[i][0] + ":  ");
            for (int j = 0; j < histogram[i][1]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
