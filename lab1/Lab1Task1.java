import java.util.Scanner;

class Lab1Task1 {
    public static void main(String[] args) {
        System.out.print("Day:");
        Scanner dd = new Scanner(System.in);
        String day = dd.nextLine();

        System.out.print("Month:");
        Scanner mm = new Scanner(System.in);
        String month = mm.nextLine();

        System.out.print("Year:");
        Scanner yy = new Scanner(System.in);
        String year = yy.nextLine();

        System.out.println("Day: " + day + " Month: " + month + " Year: " + year);
    }
}