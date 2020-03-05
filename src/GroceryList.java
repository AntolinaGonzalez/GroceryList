import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList();

    public GroceryList() {
    }

    public void addGrocery(String item) {
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + this.groceryList.size());

        for(int i = 0; i < this.groceryList.size(); ++i) {
            System.out.println(i + 1 + " . " + this.groceryList.get(i));
        }

    }

    public void modifyGroceryList(int position, String newitem) {
        this.groceryList.set(position, newitem);
        System.out.println("Grocery item " + (position + 1) + "has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = this.groceryList.get(position - 1);
        this.groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        int position = this.groceryList.indexOf(searchItem);
        return position >= 0 ?this.groceryList.get(position) : null;
    }
}
