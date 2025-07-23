class Airport {
    static int flights;

    public static void main(String[] args) {
        System.out.println("main started");
        addFlights(40);
        System.out.println("Total flights: " + flights);
        System.out.println("main ended");
    }

    public static void addFlights(int flight) {
        System.out.println("flights adding started");
        flights = flights + flight;
        System.out.println("flights adding ended");
    }
}
