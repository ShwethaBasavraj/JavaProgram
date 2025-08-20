class RailwayRunner {
    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.coachType = "Sleeper";
        coach.coachNumber = 5;
        coach.seatingCapacity = 72;
        coach.reservationStatus = "Available";

        Train train = new Train("Express Line", 12345, "City A to City B", "10:30 AM", coach);

        RailwayStation station = new RailwayStation("Central Station", "Delhi", 10, "NDLS", train);

        station.getStationInfo();
    }
}
