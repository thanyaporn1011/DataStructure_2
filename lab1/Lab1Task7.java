import java.util.Scanner;

public class Lab1Task7 {
    public static void main(String[] args) {
        int arr[] = getData(3);
        printArr(arr);

        int sum = calSum(arr);

        System.out.println("\nsum = " + sum);
    }

    public static int[] getData(int size) {
        Scanner num = new Scanner(System.in);
        int arr[] = new int[size];

        System.out.print("Enter Number: ");
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt();
        }

        return arr;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int calSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
