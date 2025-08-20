class RailwayStation {
    String stationName;
    String location;
    int platforms;
    String stationCode;
    Train train;

    RailwayStation() {

    }

    RailwayStation(String stationName, String location, int platforms, String stationCode, Train train) {
        this.stationName = stationName;
        this.location = location;
        this.platforms = platforms;
        this.stationCode = stationCode;
        this.train = train;
    }

    public void getStationInfo() {
        System.out.println("Railway Station Information:");
        System.out.println();
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Number of Platforms: " + platforms);
        System.out.println("Station Code: " + stationCode);
        System.out.println();

        this.train.getTrainInfo();
    }
}
