package ecommerce;
public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(int productId, String name, double price, int quantityInStock, int warrantyPeriod) {
        super(productId, name, price, quantityInStock);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}
