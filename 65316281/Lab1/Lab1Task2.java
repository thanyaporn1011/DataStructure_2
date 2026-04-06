import java.util.Scanner;

public class Lab1Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
