package ecommerce;


public class Grocery extends Product {
    private String expirationDate;

    public Grocery(int productId, String name, double price, int quantityInStock, String expirationDate) {
        super(productId, name, price, quantityInStock);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
