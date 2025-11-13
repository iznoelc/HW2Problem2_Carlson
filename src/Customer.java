public class Customer implements DealObserver {
    private String name;

    /**
     * Constructor to initialize the customer's name
     * @param name
     */
    public Customer(String name){
        this.name = name;
    }

    /**
     * Deal message to send the customer if they are subscribed to Black Friday deals
     * @param dealMessage to be sent to customer as a notification
     */
    public void receiveNotification(String dealMessage){
        System.out.println("Dear customer " + name + ", " + dealMessage);
    }

    /**
     * @return the customer's name
     */
    public String getName(){ return this.name; }
}
