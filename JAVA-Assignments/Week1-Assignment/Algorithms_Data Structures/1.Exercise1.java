import java.util.*;
class Product {
    int id, quantity;
    String name;
    double price;
    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String toString() {
        return id + " - " + name + " | Qty: " + quantity + " | ₹" + price;
    }
}
public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Product> inventory = new HashMap<>();
        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                inventory.put(id, new Product(id, name, qty, price));
                System.out.println("✅ Product added.");
            } else if (choice == 2) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (inventory.containsKey(id)) {
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double price = sc.nextDouble();
                    inventory.put(id, new Product(id, name, qty, price));
                    System.out.println("✅ Product updated.");
                } else {
                    System.out.println("❌ Product not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                if (inventory.remove(id) != null) {
                    System.out.println("✅ Product deleted.");
                } else {
                    System.out.println("❌ Product not found.");
                }
            } else if (choice == 4) {
                if (inventory.isEmpty()) {
                    System.out.println("📦 Inventory is empty.");
                } else {
                    System.out.println("--- Product List ---");
                    for (Product p : inventory.values()) {
                        System.out.println(p);
                    }
                }
            } else if (choice == 5) {
                System.out.println("👋 Exiting...");
                break;
            } else {
                System.out.println("❌ Invalid choice.");
            }
        }
        sc.close();
    }
