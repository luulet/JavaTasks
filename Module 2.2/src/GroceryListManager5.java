import java.util.HashMap;

public class GroceryListManager5 {
    public class Item {
        private double cost;
        private String category;
        private int quantity;

        public Item(double cost, String category, int quantity) {
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }
        public double getCost() {
            return cost;
        }
        public String getCategory() {
            return category;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
    private HashMap<String, Item> groceryList = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, new Item(cost, category, quantity));
            System.out.println("Added " + item + ", quantity: " + quantity);
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
            double cost = entry.getValue().getCost() * entry.getValue().getQuantity();
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
    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.get(item).setQuantity(newQuantity);
            System.out.println("Updated quantity of " + item + " to " + newQuantity);
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Items with quantities: ");
        for (HashMap.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().getQuantity() > 0) {
                System.out.println("Item: " + entry.getKey() + ", quantity: " + entry.getValue().getQuantity());
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager5 manager = new GroceryListManager5();

        manager.addItem("Apples", 5, "Fruits", 5);
        manager.addItem("Milk", 2, "Dairy", 2);
        manager.addItem("Bread", 2.5, "Bakery", 1);
        manager.addItem("Yogurt", 2, "Dairy", 1);
        manager.updateQuantity("Milk", 3);
        manager.displayAvailableItems();
        manager.calculateTotalCost();
        manager.displayByCategory("Dairy");
    }
}