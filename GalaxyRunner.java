class GalaxyRunner {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth", 6371, true);

        SolarSystem solarSystem = new SolarSystem("Solar System", 8, 0.0, planet);

        Galaxy galaxy = new Galaxy("Milky Way", "Spiral", 250_000_000_000L, solarSystem);

        galaxy.getGalaxyInfo();
    }
}