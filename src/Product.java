public class Product extends ProductComponent {
    private double productPrice;

    /**
     * Constructor to invoke constructor of parent class regarding the name property, and then set the product's price.
     * @param productName
     * @param productPrice
     */
    public Product(String productName, double productPrice) {
        super(productName);
        this.productPrice = productPrice;
    }

    /**
     * @return the product's price
     */
    public double getProductPrice() { return this.productPrice; }

    /**
     * Displays product's name and price
     */
    @Override
    public void display(){
        System.out.print(name + " - ");
        System.out.printf("$%.2f\n", productPrice);
    }
}
