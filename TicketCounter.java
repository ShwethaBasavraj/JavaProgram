class TicketCounter{

	public static void bookTicket(String customerName, String movieName, double price){
		System.out.println("The Booking process is started");
		
		Theater.bookingCounter(customerName,movieName,price);
		
		System.out.println("The Booking process is ended");
	}
}

