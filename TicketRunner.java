public class TicketRunner {
	
    public static void main(String[] args) {
		
        String customerName = "Ravi";
        String movieName = "Avengers";
        double price = 250.00;

        TicketCounter.bookTicket(customerName, movieName, price);
    }
}