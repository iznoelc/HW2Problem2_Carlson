import java.util.List;
import java.util.ArrayList;

public class BlackFridayDeals {
    private List<DealObserver> dealObservers; // list of customers observing black friday deals

    /**
     * Constructor to initialize the dealObservers list
     */
    public BlackFridayDeals(){
        dealObservers = new ArrayList<>();
    }

    /**
     * Add a deal observer to the list
     * @param dealObserver to be added to the list
     */
    public void addDealObserver(DealObserver dealObserver){
        dealObservers.add(dealObserver);
    }

    /**
     * Remove a deal observer from the list
     * @param dealObserver
     */
    public void removeDealObserver(DealObserver dealObserver){
        if (dealObservers.contains(dealObserver)){
            dealObservers.remove(dealObserver);
        } else {
            System.out.println("Unable to remove deal observer as they do not exist in the deal observer list.");
        }
    }

    /**
     * Notify all deal observers of a new deal. Print a message if customer is not a deal observer.
     * @param deal to notify customers of
     * @param customers customers to notify of deal IF they are a part of the dealObservers list
     */
    public void notifyCustomers(String deal, List<Customer> customers){
        for (Customer customer : customers){
            if (dealObservers.contains(customer)){
                customer.receiveNotification(deal);
            } else {
                System.out.println("Customer " + customer.getName() + " is not subscribed to deal notifications.");
            }
        }
    }
}
