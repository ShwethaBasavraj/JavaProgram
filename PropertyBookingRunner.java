class PropertyBookingRunner {
    public static void main(String args[]) {
        String buyerName = "Alice Johnson";
        String propertyType = "3BHK Apartment";
        String location = "Downtown City Center";

        BookingProcess.start(buyerName, propertyType, location);
    }
}