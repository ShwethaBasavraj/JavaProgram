class ManagerProperty {
    public static void approveBooking(String buyerName, String propertyType, String location) {
        System.out.println("Manager has approved the property booking.");
        Legal.processDocuments(buyerName, propertyType, location);
    }
}