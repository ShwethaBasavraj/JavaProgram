class SolarSystem{

    static String systemName = "Solar System";
    static String starName = "Sun";
    static double starMassKg = 1.989e30;
    static double starRadiusKm = 696340;
    static int numberOfPlanets = 8;
	static String closestPlanet = "Mercury";
    static String farthestPlanet = "Neptune";
    static double averageDistanceFromStarAU = 1.0; 
	static boolean hasAsteroidBelt = true;
    static boolean hasKuiperBelt = true;
    static boolean hasOortCloud = true;
	static String galaxyName = "Milky Way";
	static int ageBillionYears = 4; 
	static double orbitalPeriodEarthYears = 1.0; 
    static double rotationPeriodHours = 24.0; 
	static boolean supportsLife = true;
    static int numberOfMoons = 214; 
	static String dominantElement = "Hydrogen and Helium";
    static boolean hasMagneticField = true;
    static String missionName = "Voyager 1";
    static String lastMissionDate = "2012-08-25";

    public static void main(String[] args) {
       
        System.out.println("=== Solar System Information ===");
        System.out.println("System Name: " + systemName);
        System.out.println("Star Name: " + starName);
        System.out.println("Star Mass: " + starMassKg + " kg");
        System.out.println("Star Radius: " + starRadiusKm + " km");
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Closest Planet: " + closestPlanet);
        System.out.println("Farthest Planet: " + farthestPlanet);
        System.out.println("Average Distance from Star (AU): " + averageDistanceFromStarAU);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Has Kuiper Belt: " + hasKuiperBelt);
        System.out.println("Has Oort Cloud: " + hasOortCloud);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Age (Billion Years): " + ageBillionYears);
        System.out.println("Orbital Period (Earth Years): " + orbitalPeriodEarthYears);
        System.out.println("Rotation Period (Hours): " + rotationPeriodHours);
        System.out.println("Supports Life: " + supportsLife);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Dominant Element: " + dominantElement);
        System.out.println("Has Magnetic Field: " + hasMagneticField);
        System.out.println("Last Space Mission: " + missionName);
        System.out.println("Last Mission Date: " + lastMissionDate);
    }
}
