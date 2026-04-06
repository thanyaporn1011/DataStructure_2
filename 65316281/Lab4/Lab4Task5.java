import java.util.Scanner;

public class Lab4Task5 {
    public static void main(String[] args) {
        int data[] = getData(8);
        System.out.println("++++ boubble sort ++++");
        int bbout[] = bbSort(data);
        System.out.println("++++ Selection sort ++++");
        int selout[] = selectionSort(data);
        System.out.println("++++ insert sort ++++");
        int insout[] = insertSort(data);
    }

    public static int[] bbSort(int[] d) {
        int[] arr = d.clone(); // โคลนออกมาให้ arr
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {

                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;

                }
            }
            System.out.print(i + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//

    public static int[] selectionSort(int[] d) {
        int[] arr = d.clone();
        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++)

                if (arr[j] < arr[index])

                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

            System.out.print(i + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//

    public static int[] insertSort(int[] d) {
        int[] arr = d.clone();
        for (int j = 1; j < arr.length; j++) {

            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {

                arr[i + 1] = arr[i];
                i--;

            }
            arr[i + 1] = key;
            System.out.print(j + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//

    public static int[] getData(int n) {
        int[] ans = new int[n];
        Scanner in = new Scanner(System.in); // import java.util.*;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = in.nextInt();
        }
        return ans;
    }// getData
}// class
