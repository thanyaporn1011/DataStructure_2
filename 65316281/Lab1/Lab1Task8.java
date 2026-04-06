import java.util.Scanner;

public class Lab1Task8 {
     public static void main(String[] args) {
        int arr[] = getData(3);
        System.out.println(printArr(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);

        double avg = (double)sum/(arr.length);
        System.out.printf("average = %.2f" , avg);
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

    static int calSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
