package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Lab2Extra {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String data = sc.next();

        String[] dt = data.split(",");
        int[] dt1 = new int[dt.length];

        for (int i = 0; i < dt1.length; i++) {
            dt1[i] = Integer.parseInt(dt[i]);
        }
        Arrays.sort(dt1);
        max = dt1[dt1.length-1];

        System.out.println("Output: " + max);
    }
}
