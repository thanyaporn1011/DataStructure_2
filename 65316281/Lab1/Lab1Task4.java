public class Lab1Task4 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 87, 15, 24, 32 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
