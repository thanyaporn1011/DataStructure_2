import java.util.Scanner;
public class Lab1Task1 {
    public static void main(String[] args) {

        Scanner dd = new Scanner(System.in);
        System.out.print("Day: ");
        int day = dd.nextInt();

        System.out.print("Month: ");
        String month = dd.next();

        System.out.print("Year: ");
        int year = dd.nextInt();

        System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
    }
}
