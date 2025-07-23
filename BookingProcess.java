class BookingProcess {
    public static void start(String buyerName, String propertyType, String location) {
        System.out.println("Property booking process has started.");
        Agent.checkAvailability(buyerName, propertyType, location);
        System.out.println("Property booking process completed.");
    }
}