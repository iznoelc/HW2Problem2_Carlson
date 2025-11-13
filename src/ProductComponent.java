public abstract class ProductComponent {
    protected String name;

    /**
     * Constructor to initialize a product component's name
     * @param name of component
     */
    public ProductComponent(String name){
        this.name = name;
    }

    /**
     * @return the product component's name
     */
    public String getName() { return this.name; }

    /**
     * Abstract method to display details as categories and products will need to display details differently.
     */
    public abstract void display();
}
