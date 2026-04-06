import java.util.Scanner;

public class demoAVL {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        // Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("++++ Menu ++++");
            System.out.println("1. Insert");
            System.out.println("2. Pre-Order, In-Order, Post-Order");
            System.out.println("3. Height");
            System.out.println("4. Search");
            System.out.println("5. Delete");
            System.out.println("6. Quit");
            System.out.print("Enter your choice : ");
            choice = input();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Insert elements to the AVL tree. (Separate with spaces.) : ");
                    String[] elements = inputString().split("\\s+");

                    for (String element : elements) {
                        try {
                            int key = Integer.parseInt(element);
                            tree.root = tree.insert(tree.root, key);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter valid integers separated by spaces.");
                        }
                    }
                    System.out.println();
                    break;
                case 2: // แคปใหม่
                    System.out.println();
                    System.out.println("++ Preorder traversal ++");
                    tree.preOrder(tree.root);
                    System.out.println("");
                    System.out.println();

                    System.out.println("++ Inorder traversal ++");
                    tree.inOrder(tree.root);
                    System.out.println("");
                    System.out.println();

                    System.out.println("++ Postorder traversal ++");
                    tree.postOrder(tree.root);
                    System.out.println("");
                    System.out.println();

                    break;
                case 3:
                    int height = tree.height(tree.root);
                    System.out.println();
                    System.out.println("Tree Height : " + height);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Enter element to search : ");
                    int searchKey = input();
                    Node searchResult = tree.search(tree.root, searchKey);
                    if (searchResult != null) {
                        System.out.println("Element found in the tree.");
                        System.out.println();
                    } else {
                        System.out.println("Element not found in the tree.");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.print("Enter element to delete : ");
                    int deleteKey = input();
                    Node deleteResult = tree.search(tree.root, deleteKey);
                    if (deleteResult != null) {
                        tree.root = tree.delete(tree.root, deleteKey);
                        System.out.println("Delete " + deleteKey + " has been from tree.");
                        System.out.println();
                    } else {
                        System.out.println("Element not found in the tree.");
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 6);

        // scanner.close();
    }

    private static int input() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                // System.out.print("Enter your choice: ");
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static String inputString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
