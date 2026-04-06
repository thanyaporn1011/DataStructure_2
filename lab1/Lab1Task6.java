import java.util.Scanner;

public class Lab1Task6 {
    public static void main(String[] args) {
        int arr[] = getData(5);
        printArr(arr);
    }

    static int[] getData(int size) {
        Scanner num = new Scanner(System.in);
        int arr[] = new int[size];

        System.out.println("Enter Number: ");

        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt();
        }

        return arr;
    }

    static void printArr(int[] arr) {
        System.out.print("Number: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
