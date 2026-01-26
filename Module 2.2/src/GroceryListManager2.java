import java.util.HashMap;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            System.out.println("Added " + item);
        } else {
            System.out.println(item + " is already in the list.");
        }
    }
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removed " + item);
        } else {
            System.out.println(item + "not found in the list.");
        }

    }
    public void displayList() {
        System.out.print("Grocery list: ");
        for (HashMap.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void calculateTotalCost() {
        System.out.print("Grocery list total cost: ");
        double total = (double) 0;
        for (HashMap.Entry<String, Double> entry : groceryList.entrySet()) {
            double cost = entry.getValue();
            total = (double) total + (double) cost;
        }
        System.out.print(total + " €");
        System.out.println();
    }


    public boolean checkItem(String item) {
        return groceryList.containsKey(item);


    }
    public static void main(String[] args) {
        GroceryListManager2 manager = new GroceryListManager2();

        manager.addItem("Apples", 5);
        manager.addItem("Milk", 2);
        manager.addItem("Bread", 2.5);
        manager.displayList();
        manager.calculateTotalCost();
    }
}