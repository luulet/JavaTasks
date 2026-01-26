import java.util.HashMap;

public class GroceryListManager3 {
    public class Item {
        private double cost;
        private String category;

        public Item(double cost, String category) {
            this.cost = cost;
            this.category = category;
        }
        public double getCost() {
            return cost;
        }
        public String getCategory() {
            return category;
        }
    }
    private HashMap<String, Item> groceryList = new HashMap<>();

    public void addItem(String item, double cost, String category) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, new Item(cost, category));
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
        for (HashMap.Entry<String, Item> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void calculateTotalCost() {
        System.out.print("Grocery list total cost: ");
        double total = (double) 0;
        for (HashMap.Entry<String, Item> entry : groceryList.entrySet()) {
            double cost = entry.getValue().getCost();
            total = (double) total + (double) cost;
        }
        System.out.print(total + " €");
        System.out.println();
    }


    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }
    public void displayByCategory(String category) {
        System.out.print(category + ": ");
        for (HashMap.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().getCategory().equalsIgnoreCase(category)) {
                String item = entry.getKey();
                System.out.print(item + " ");
            }

        }
        System.out.println();
    }


    public static void main(String[] args) {
        GroceryListManager3 manager = new GroceryListManager3();

        manager.addItem("Apples", 5, "Fruits");
        manager.addItem("Milk", 2, "Dairy");
        manager.addItem("Bread", 2.5, "Bakery");
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Fruits");
    }
}