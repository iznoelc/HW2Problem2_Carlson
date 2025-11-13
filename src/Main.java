import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // create a black friday deals category
        Category blackFridayDeals = new Category("BLACK FRIDAY DEALS");

        // set up a few products (laptop & phone) and then add them to a common category (electronics)
        Product laptop = new Product("ASUS Gaming Laptop", 1299.99);
        Product phone = new Product("iPhone 15", 899.99);
        Category electronics = new Category("Electronics");
        electronics.add(laptop);
        electronics.add(phone);

        // then add the whole electronics category to the black friday deals category
        blackFridayDeals.add(electronics);

        // create a black friday deals (subject)
        BlackFridayDeals subject = new BlackFridayDeals();

        // create some customers
        List<Customer> customers = new ArrayList<>();
        Customer kyoko = new Customer("Kyoko Kirigiri");
        Customer makoto = new Customer("Makoto Naegi");
        Customer byakuya = new Customer("Byakuya Togami");
        customers.add(kyoko);
        customers.add(makoto);
        customers.add(byakuya);

        // subscribe some to the black friday deals and others not for testing purposes
        subject.addDealObserver(kyoko);
        subject.addDealObserver(makoto);

        // notify subscribed customers
        String deal = "New deal available! Huge deal on electronics!";
        subject.notifyCustomers(deal, customers);
    }
}