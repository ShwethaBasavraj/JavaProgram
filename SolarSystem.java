class SolarSystem {
    String systemName;
    int numberOfPlanets;
    double distanceFromEarth;
    Planet planet;

    SolarSystem() {
    }

    SolarSystem(String systemName, int numberOfPlanets, double distanceFromEarth, Planet planet) {
        this.systemName = systemName;
        this.numberOfPlanets = numberOfPlanets;
        this.distanceFromEarth = distanceFromEarth;
        this.planet = planet;
    }

    public void getSolarSystemInfo() {
        System.out.println("Solar System Information:");
        System.out.println();
        System.out.println("Solar System Name: " + systemName);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Distance from Earth (light years): " + distanceFromEarth);
        System.out.println();

        planet.getPlanetInfo();
    }
}
