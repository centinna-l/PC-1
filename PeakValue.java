class PeakValue {

    static int peakValue(int[] arr) {
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            peak = arr[i] > peak ? arr[i] : peak;
        }
        System.out.println(peak);
        return peak;
    }

    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 5, 55, 8 };
            int peak = peakValue(arr);
            System.out.println("The peak value in the array is: " + peak);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
