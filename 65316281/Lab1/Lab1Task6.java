import java.util.Scanner;

public class Lab1Task6 {
    public static void main(String[] args) {
        int arr[] = getData(5);
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

    static int[] getData(int num) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
