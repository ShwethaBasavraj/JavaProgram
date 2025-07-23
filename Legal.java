class Legal {
    public static void processDocuments(String buyerName, String propertyType, String location) {
        System.out.println("Legal department is processing the property documents...");
        Buyer.receiveConfirmation(buyerName, propertyType, location);
    }
}
