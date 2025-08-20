class Majestic {
    String locationName;
    String city;
    int numberOfStands;
    String openHours;
    BusStand busStand;

    Majestic() {

    }

    Majestic(String locationName, String city, int numberOfStands, String openHours, BusStand busStand) {
        this.locationName = locationName;
        this.city = city;
        this.numberOfStands = numberOfStands;
        this.openHours = openHours;
        this.busStand = busStand;
    }

    public void getMajesticInfo() {
        System.out.println("Majestic Information:");
        System.out.println();
        System.out.println("Location Name: " + locationName);
        System.out.println("City: " + city);
        System.out.println("Number of Stands: " + numberOfStands);
        System.out.println("Open Hours: " + openHours);
        System.out.println();

        this.busStand.getStandInfo();
    }
}
