public interface DealObserver {
    /**
     * Notification to send to deal observers when there is a new deal
     * @param dealMessage to send as a notification
     */
    void receiveNotification(String dealMessage);
}
