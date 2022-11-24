import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        char[] chArray1 = new char[] { 'a', 'c', 'k', 'i', 'b' };
        char[] chArray2 = new char[] { 'b', 'i', 'a', 'a', 'c' };

        Arrays.sort(chArray1);
        Arrays.sort(chArray2);

        // char[] chArraySorted1 = sortArray(chArray1);
        // char[] chArraySorted2 = sortArray(chArray2);
        int count = 0;
        for (int i = 0; i < chArray1.length; i++) {
            if (chArray1[i] == chArray2[i]) {
                count++;
            }
        }

        if (count == chArray1.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static char[] sortArray(char[] chArray) {
        int lp = 0, rp = chArray.length - 1;
        System.out.println(chArray[lp] < chArray[rp]);
        while (lp < rp) {
            if (chArray[lp] < chArray[rp]) {
                lp++;
            }
            if (chArray[lp] == chArray[rp]) {
                lp++;
                rp--;
            }
            if (chArray[lp] > chArray[rp]) {
                char temp = chArray[lp];
                chArray[lp] = chArray[rp];
                chArray[rp] = temp;
            }
        }
        return chArray;
    }

}
