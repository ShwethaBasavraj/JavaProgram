class LokSabha {
    String lokSabhaName;
    String location;
    int noOfSeats;
    String sessionTiming;
    Seat seat;
    
    LokSabha() {
        
    }
    
    LokSabha(String lokSabhaName, String location, int noOfSeats, String sessionTiming, Seat seat) {
        this.lokSabhaName = lokSabhaName;
        this.location = location;
        this.noOfSeats = noOfSeats;
        this.sessionTiming = sessionTiming;
        this.seat = seat;
    }
    
    public void getLibraryInfo() {
        System.out.println("LokSabha Information :");
        System.out.println();
        System.out.println("LokSabha Name :" + lokSabhaName);
        System.out.println("LokSabha Location :" + location);
        System.out.println("Number of Seats :" + noOfSeats);
        System.out.println("Session Timing :" + sessionTiming);
        System.out.println();
        
        this.seat.getShelfInfo();
    }
}
