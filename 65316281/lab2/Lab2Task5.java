package lab2;

import java.util.HashSet;
import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pay = 0.0;
        int price[] = { 50, 60, 70, 80, 85 };

        HashSet coupon = new HashSet();
        coupon.add("A001");
        coupon.add("A002");
        coupon.add("A003");
        coupon.add("A004");
        coupon.add("A005");
        coupon.add("A006");
        coupon.add("A007");
        coupon.add("A008");
        coupon.add("A009");
        coupon.add("A010");
        while (true) {
            menu();
            System.out.print("Press number:");
            int num = sc.nextInt();
            if (num == 6) {
                System.out.println("--------Good bye--------");
                System.exit(1);
            } else if (num >= 1 && num <= 5) {
                System.out.print("Discount Code (Dont't have please enter 0):");
                String cu = sc.next();
                if (coupon.contains(cu)) {
                    pay = (90.0 / 100) * price[num - 1];
                    coupon.remove(cu);
                } else {
                    pay = price[num - 1];
                }
                System.out.println("Total price:" + pay + "Bath");
            }
        }
    }

    static void menu() {
        String menuList[] = { "Thai Coffee", "Latte", "Espresso", "Mocha", "Cappucino" };
        int price[] = { 50, 60, 70, 80, 85 };

        System.out.println("======= Coffee List ======= ");
        for (int i = 0; i < menuList.length; i++) {
            System.out.println("[" + (i + 1) + "] " + menuList[i] + "\t---- " + price[i] + " Baht");
        }
        System.out.println("[6] Exit");
    }
}
