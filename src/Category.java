import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {
    private List<ProductComponent> group; // list that can hold products or other categories to make up the current category

    /**
     * Constructor to invoke constructor of parent class regarding the name property, and then initialize the
     * group array list.
     * @param name of the category
     */
    public Category(String name) {
        super(name);
        this.group = new ArrayList<>();
    }

    /**
     * Add a product or category to the current category
     * @param item to be added
     */
    public void add(ProductComponent item){
        group.add(item);
    }

    /**
     * Display all items/sub-categories in the current category.
     */
    @Override
    public void display() {
        System.out.println("======================");
        System.out.println("CATEGORY: " + name);
        System.out.println("======================");

        for (ProductComponent item : group){
            item.display();
        }
    }
}
