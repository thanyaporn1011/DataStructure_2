import java.util.Scanner;

public class Lab1Task2 {
    public static void main(String[] args) {
        // รับจำนวนบรรทัดจากคีย์บอร์ด
        Scanner num = new Scanner(System.in);
        System.out.print("Num: ");
        int number = num.nextInt();

        if (number > 0) {

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}