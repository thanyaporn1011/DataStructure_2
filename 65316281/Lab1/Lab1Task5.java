public class Lab1Task5 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 87, 15, 24, 32 };
        System.out.println(printArr(arr));
    }

    static String printArr(int[] arr) {
        String x = "";
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            if (i < arr.length - 1) {
                x += ",";
            }
        }
        return x;
    }
}
