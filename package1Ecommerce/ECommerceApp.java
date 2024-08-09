import ecommerce.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceApp {
    private static List<Product> products = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    placeOrder();
                    break;
                case 3:
                    viewOrders();
                    break;
                case 4:
                    updateStock();
                    break;
                case 5:
                    System.out.println("Thank you for using the E-Commerce App. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- E-Commerce App Menu ---");
        System.out.println("1. Add Product");
        System.out.println("2. Place Order");
        System.out.println("3. View Orders");
        System.out.println("4. Update Stock");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addProduct() {
        System.out.println("\n--- Add Product ---");
        System.out.print("Enter product type (1: Electronics, 2: Clothing, 3: Grocery): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int quantityInStock = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product product;

        switch (type) {
            case 1:
                System.out.print("Enter warranty period (months): ");
                int warrantyPeriod = scanner.nextInt();
                product = new Electronics(productId, name, price, quantityInStock, warrantyPeriod);
                break;
            case 2:
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                product = new Clothing(productId, name, price, quantityInStock, size);
                break;
            case 3:
                System.out.print("Enter expiration date: ");
                String expirationDate = scanner.nextLine();
                product = new Grocery(productId, name, price, quantityInStock, expirationDate);
                break;
            default:
                System.out.println("Invalid product type.");
                return;
        }

        products.add(product);
        System.out.println("Product added successfully.");
    }

    private static void placeOrder() {
        System.out.println("\n--- Place Order ---");
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).name);
        }

        System.out.print("Enter the product number: ");
        int productIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (productIndex < 0 || productIndex >= products.size()) {
            System.out.println("Invalid product number.");
            return;
        }

        Product selectedProduct = products.get(productIndex);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quantity <= 0 || quantity > selectedProduct.quantityInStock) {
            System.out.println("Invalid quantity.");
            return;
        }

        Order order = new Order(orders.size() + 1, selectedProduct, quantity);
        order.placeOrder();
        orders.add(order);
    }

    private static void viewOrders() {
        System.out.println("\n--- View Orders ---");
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        for (Order order : orders) {
            order.displayOrderDetails();
            System.out.println();
        }
    }

    private static void updateStock() {
        System.out.println("\n--- Update Stock ---");
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).name);
        }

        System.out.print("Enter the product number: ");
        int productIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (productIndex < 0 || productIndex >= products.size()) {
            System.out.println("Invalid product number.");
            return;
        }

        Product selectedProduct = products.get(productIndex);

        System.out.print("Enter quantity to add (use negative value to reduce stock): ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        selectedProduct.updateStock(quantity);
        System.out.println("Stock updated successfully.");
    }
}
