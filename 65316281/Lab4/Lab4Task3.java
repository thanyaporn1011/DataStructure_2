public class Lab4Task3 {
    public static void main(String[] args) {
        int data[] = { 4, 2, 3, 9, 8, 1, 0, 5 };
        System.out.println("+++++buble sort+++++");
        int bbout[] = bbSort(data);
        Lab4Task1.printArray(bbout);
        System.out.println("+++++selection sort+++++");
        int selout[] = selectionSort(data);
        Lab4Task1.printArray(selout);
        System.out.println("+++++insertion sort+++++");
        int insout[] = insertSort(data);
        Lab4Task1.printArray(insout);
    }

    public static int[] bbSort(int[] d) {
        int[] arr = d.clone(); // โคลนออกมาให้ arr
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {

                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;

                }
            }
            System.out.print(i + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//

    public static int[] selectionSort(int[] d) {
        int[] arr = d.clone();
        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++)

                if (arr[j] < arr[index])

                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

             System.out.print(i + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//

    public static int[] insertSort(int[] d) {
        int[] arr = d.clone();
        for (int j = 1; j < arr.length; j++) {

            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {

                arr[i + 1] = arr[i];
                i--;

            }
            arr[i + 1] = key;
            System.out.print(j + ": ");
            Lab4Task1.printArray(arr);
        }
        return arr;
    }//
}// class
