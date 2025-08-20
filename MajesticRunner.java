class MajesticRunner {
    public static void main(String[] args) {
        Platform platform = new Platform();
        platform.platformName = "Platform 12";
        platform.type = "Departure";
        platform.platformNumber = 12;
        platform.status = "Active";

        BusStand busStand = new BusStand("City Bus Stand", 20, 501, "Urban", platform);

        Majestic majestic = new Majestic("Majestic", "Bangalore", 5, "5 AM to 11 PM", busStand);

        majestic.getMajesticInfo();
    }
}
