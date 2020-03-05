import java.util.Scanner;

public class Main {
    private static Scanner scan;
    private static GroceryList groceryLista;

    public Main() {
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice");
            int choice2 = scan.nextInt();
            scan.nextLine();
            switch(choice2) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryLista.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choise options");
        System.out.println("\t 1 - To print the list of Grocery Items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - to Modify an item in the list ");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryLista.addGrocery(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number");
        int itemNo = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryLista.modifyGroceryList(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number");
        int itemNo = scan.nextInt();
        scan.nextLine();
        groceryLista.removeGroceryItem(itemNo - 1);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scan.nextLine();
        if (groceryLista.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + "in our grocery");
        } else {
            System.out.println(searchItem + "is not in the shopping list");
        }

    }

    static {
        scan = new Scanner(System.in);
        groceryLista = new GroceryList();
    }
}
