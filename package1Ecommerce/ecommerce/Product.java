package ecommerce;


public class Product {
    public int productId;
    public String name;
    public double price;
    public int quantityInStock;

    public Product(int productId, String name, double price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

    public void updateStock(int quantity) {
        this.quantityInStock += quantity;
    }
}

