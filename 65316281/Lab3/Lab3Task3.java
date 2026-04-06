package Lab3;
import java.util.*;
public class Lab3Task3 {
    public static void main(String[] args) {
        int data[] = { 10, 12, 50, 45, 98, 32, 2, 78 }; //index(0,1,2,3,4,...)
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        System.out.println("the position is: " + search(data, n));
    }

    static int search(int[] arrdt, int num) { 
        for (int i = 0; i < arrdt.length; i++) {
            if (num == arrdt[i]) {
                return i; //true print position
            }
        }
        return -1;
    }
}