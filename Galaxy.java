class Galaxy {
    String galaxyName;
    String galaxyType;
    long numberOfStars;
    SolarSystem solarSystem;

    Galaxy() {
    }

    Galaxy(String galaxyName, String galaxyType, long numberOfStars, SolarSystem solarSystem) {
        this.galaxyName = galaxyName;
        this.galaxyType = galaxyType;
        this.numberOfStars = numberOfStars;
        this.solarSystem = solarSystem;
    }

    public void getGalaxyInfo() {
        System.out.println("Galaxy Information:");
        System.out.println();
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Galaxy Type: " + galaxyType);
        System.out.println("Number of Stars: " + numberOfStars);
        System.out.println();

        solarSystem.getSolarSystemInfo();
    }
}