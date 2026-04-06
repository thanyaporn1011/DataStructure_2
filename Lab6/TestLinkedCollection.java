import java.util.*;

public class TestLinkedCollection {
    public static void main(String[] args) {
        LinkedCollection mydata = new LinkedCollection();
        for (int i = 1; i <= 5; i++) {
            mydata.addL(input());
        }
        
        System.out.println("Data<1>: " + mydata);
        boolean b = mydata.contains(input());
        System.out.println("Contains = " + b);

        mydata.remove(input());
        System.out.println("Size = " + mydata.size());
        System.out.println("Data<2>: " + mydata);
        System.out.println("Empty = " + mydata.isEmpty());
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}