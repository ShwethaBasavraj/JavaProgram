public class Theater {
    public static void bookingCounter(String customerName, String movieName, double price) {
		
        System.out.println("Booking is in progress : " + customerName);
        Cashier.collectPayment(customerName, movieName, price);

        System.out.println("MovieName: " + movieName);
        System.out.println("Booking confirmed for " + customerName);
    }
}

