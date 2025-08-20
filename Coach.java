class Coach {
    String coachType;
    int coachNumber;
    int seatingCapacity;
    String reservationStatus;

    public void getCoachInfo() {
        System.out.println("Coach Information:");
        System.out.println();
        System.out.println("Coach Type: " + coachType);
        System.out.println("Coach Number: " + coachNumber);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Reservation Status: " + reservationStatus);
        System.out.println();
    }
}
