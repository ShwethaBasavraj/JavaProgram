class BusStand {
    String standName;
    int totalPlatforms;
    int standId;
    String category;
    Platform platform;

    BusStand() {

    }

    BusStand(String standName, int totalPlatforms, int standId, String category, Platform platform) {
        this.standName = standName;
        this.totalPlatforms = totalPlatforms;
        this.standId = standId;
        this.category = category;
        this.platform = platform;
    }

    public void getStandInfo() {
        System.out.println("Bus Stand Information:");
        System.out.println();
        System.out.println("Stand Name: " + standName);
        System.out.println("Total Platforms: " + totalPlatforms);
        System.out.println("Stand ID: " + standId);
        System.out.println("Category: " + category);
        System.out.println();

        this.platform.getPlatformInfo();
    }
}
