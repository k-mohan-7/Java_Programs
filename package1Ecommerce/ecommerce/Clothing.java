package ecommerce;

public class Clothing extends Product {
    private String size;

    public Clothing(int productId, String name, double price, int quantityInStock, String size) {
        super(productId, name, price, quantityInStock);
        this.size = size;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
    }
}