public class Sort {
    public static void main(String[] args) {
        int data[] = { 8, 5, 3, 4, 7, 9, 6 };
        int tmp = 0;
        printArray(data);

        for (int i = 0; i < data.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index])
                    index = j;
            }
            tmp = data[index];
            data[index] = data[i];
            data[i] = tmp;

            printArray(data);
        }
    }

    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) 
            System.out.print(num[i] + " ");
            System.out.println();
        
    }
}
