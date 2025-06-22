import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Product {
    int productId;
    String productName;
    String category;
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}
public class Main {
    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String target) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(target);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shirt", "Apparel"),
            new Product(4, "Book", "Education"),
            new Product(5, "Shoes", "Footwear")
        };
        System.out.println("Enter product name to search (Linear Search): ");
        String search1 = sc.nextLine();
        Product result1 = linearSearch(products, search1);
        if (result1 != null)
            System.out.println("Found: " + result1);
        else
            System.out.println("Product not found.");
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nEnter product name to search (Binary Search): ");
        String search2 = sc.nextLine();
        Product result2 = binarySearch(products, search2);
        if (result2 != null)
            System.out.println("Found: " + result2);
        else
            System.out.println("Product not found.");
    }
}
