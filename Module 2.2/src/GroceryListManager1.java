import java.util.ArrayList;


public class GroceryListManager1 {
    private String item;
    private boolean checkItem;
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item, double cost) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println("Added " + item);
        } else {
            System.out.println(item + " is already in the list.");
        }
    }
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removed " + item);
        } else {
            System.out.println(item + "not found in the list.");
        }

    }
    public void displayList() {
        System.out.println("Grocery list: ");
        for (String item : groceryList) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }




    public boolean checkItem(String item) {
        return groceryList.contains(item);


    }
    public static void main(String[] args) {
        GroceryListManager1 manager = new GroceryListManager1();

        manager.addItem("Apples", 5);
        manager.addItem("Milk", 2);
        manager.addItem("Bread", 2.5);

        manager.displayList();
        if (manager.checkItem("Apples")) {
            System.out.println("Apples is in the grocery list.");
        } else {
            System.out.println("Apples is not in the grocery list.");
        }

        manager.removeItem("Apples");
        if (manager.checkItem("Apples")) {
            System.out.println("Apples is in the grocery list.");
        } else {
            System.out.println("Apples is not in the grocery list.");
        }
        manager.displayList();
    }
}