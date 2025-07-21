class Satellite{

   
    static String satelliteName;
    static String satelliteId;
    static String launchDate;
    static String countryOfOrigin;
    static String launchVehicle;
    static String launchSite;
	static String orbitType;
    static int orbitAltitudeKm;
    static int orbitInclinationDeg;
    static boolean isGeostationary;
	static double payloadMassKg;
    static String missionType;
    static int operationalLifespanYears;
	static boolean hasSolarPanels;
    static double powerOutputWatts;
	static String controlCenterLocation;
    static String manufacturer;
	static boolean hasCommunicationSystem;
    static boolean hasImagingSystem;
	static String lastContactDate;
    static boolean isCurrentlyOperational;

    public static void main(String[] args) {
        
        System.out.println("=== Satellite Information ===");
        System.out.println(satelliteName);
        System.out.println(satelliteId);
        System.out.println(launchDate);
        System.out.println(countryOfOrigin);
        System.out.println(launchVehicle);
        System.out.println(launchSite);
        System.out.println(orbitType);
        System.out.println(orbitAltitudeKm + " km");
        System.out.println(orbitInclinationDeg + "°");
        System.out.println(isGeostationary);
        System.out.println(payloadMassKg + " kg");
        System.out.println(missionType);
        System.out.println(operationalLifespanYears + " years");
        System.out.println(hasSolarPanels);
        System.out.println(powerOutputWatts + " watts");
        System.out.println(controlCenterLocation);
        System.out.println(manufacturer);
        System.out.println(hasCommunicationSystem);
        System.out.println(hasImagingSystem);
        System.out.println(lastContactDate);
        System.out.println(isCurrentlyOperational);
		
		System.out.println();
		
	satelliteName = "OrionSat-5";
    satelliteId = "SAT202506";
    launchDate = "2025-03-12";
    countryOfOrigin = "USA";
    launchVehicle = "Falcon 9";
    launchSite = "Cape Canaveral, Florida";
	orbitType = "Low Earth Orbit (LEO)";
    orbitAltitudeKm = 550;
    orbitInclinationDeg = 53;
    isGeostationary = false;
	payloadMassKg = 1200.5;
    missionType = "Earth Observation";
    operationalLifespanYears = 7;
	hasSolarPanels = true;
    powerOutputWatts = 1500.0;
	controlCenterLocation = "Houston, Texas";
    manufacturer = "SpaceTech Industries";
	hasCommunicationSystem = true;
    hasImagingSystem = true;
	lastContactDate = "2025-06-20";
    isCurrentlyOperational = true;
	
		System.out.println("=== Satellite Information ===");
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite ID: " + satelliteId);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbit Altitude: " + orbitAltitudeKm + " km");
        System.out.println("Orbit Inclination: " + orbitInclinationDeg + "°");
        System.out.println("Geostationary: " + isGeostationary);
        System.out.println("Payload Mass: " + payloadMassKg + " kg");
        System.out.println("Mission Type: " + missionType);
        System.out.println("Operational Lifespan: " + operationalLifespanYears + " years");
        System.out.println("Solar Panels: " + hasSolarPanels);
        System.out.println("Power Output: " + powerOutputWatts + " watts");
        System.out.println("Control Center: " + controlCenterLocation);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Communication System: " + hasCommunicationSystem);
        System.out.println("Imaging System: " + hasImagingSystem);
        System.out.println("Last Contact Date: " + lastContactDate);
        System.out.println("Currently Operational: " + isCurrentlyOperational);
    }
}
