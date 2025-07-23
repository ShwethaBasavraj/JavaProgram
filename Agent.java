class Agent {
    public static void checkAvailability(String buyerName, String propertyType, String location) {
        System.out.println("Agent is checking availability of the property...");
        ManagerProperty.approveBooking(buyerName, propertyType, location);
    }
}
