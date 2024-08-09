package ecommerce;

public class Order implements Orderable {
    private int orderId;
    private Product product;
    private int quantity;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public void placeOrder() {
        if (product.quantityInStock >= quantity) {
            product.updateStock(-quantity);
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Insufficient stock. Order cannot be placed.");
        }
    }

    @Override
    public void cancelOrder() {
        product.updateStock(quantity);
        System.out.println("Order cancelled successfully.");
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        product.displayProductDetails();
        System.out.println("Quantity: " + quantity);
    }
}