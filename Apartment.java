class Apartment{

    static String apartmentName;
    static String apartmentLocation;
    static String apartmentId;
    static int numberOfFloors;
    static int totalFlats;
    static boolean hasLift;
    static boolean hasParking;
    static boolean hasGym;
    static boolean hasSwimmingPool;
    static boolean hasSecurity;
    static int numberOfSecurityGuards;
    static String managerName;
    static String contactEmail;
    static long contactPhone;
    static int constructionYear;
    static String builderName;
    static boolean hasBackupGenerator;
    static boolean hasCommunityHall;
	static String lastMaintenanceDate;
    static int monthlyMaintenanceFee;
    static boolean petFriendly;

    public static void main(String[] args) {
        // Output all static apartment information
        System.out.println("=== Apartment Information ===");
        System.out.println(apartmentName);
        System.out.println(apartmentLocation);
        System.out.println(apartmentId);
        System.out.println(numberOfFloors);
        System.out.println(totalFlats);
        System.out.println(hasLift);
        System.out.println(hasParking);
        System.out.println(hasGym);
        System.out.println(hasSwimmingPool);
        System.out.println(hasSecurity);
        System.out.println(numberOfSecurityGuards);
        System.out.println(managerName);
        System.out.println(contactEmail);
        System.out.println(contactPhone);
        System.out.println(constructionYear);
        System.out.println(builderName);
        System.out.println(hasBackupGenerator);
        System.out.println(hasCommunityHall);
        System.out.println(lastMaintenanceDate);
        System.out.println(monthlyMaintenanceFee);
        System.out.println(petFriendly);
		
		System.out.println();
		
	apartmentName = "SJR";
    apartmentLocation = "Electronic City Phase1";
    apartmentId = "APT202506";
    numberOfFloors = 12;
    totalFlats = 96;
    hasLift = true;
    hasParking = true;
    hasGym = true;
    hasSwimmingPool = false;
    hasSecurity = true;
    numberOfSecurityGuards = 16;
    managerName = "Mr. Sudir";
    contactEmail = "office@sjrapt.com";
    contactPhone = 6412336978l;
    constructionYear = 2015;
    builderName = "Skyline Constructions Ltd.";
    hasBackupGenerator = true;
    hasCommunityHall = true;
	lastMaintenanceDate = "2025-05-20";
    monthlyMaintenanceFee = 850;
    petFriendly = true;
	
		System.out.println("=== Apartment Information ===");
        System.out.println("Apartment Name: " + apartmentName);
        System.out.println("Location: " + apartmentLocation);
        System.out.println("Apartment ID: " + apartmentId);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Flats: " + totalFlats);
        System.out.println("Has Lift: " + hasLift);
        System.out.println("Has Parking: " + hasParking);
        System.out.println("Has Gym: " + hasGym);
        System.out.println("Has Swimming Pool: " + hasSwimmingPool);
        System.out.println("Has Security: " + hasSecurity);
        System.out.println("Number of Security Guards: " + numberOfSecurityGuards);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Construction Year: " + constructionYear);
        System.out.println("Builder Name: " + builderName);
        System.out.println("Backup Generator: " + hasBackupGenerator);
        System.out.println("Community Hall: " + hasCommunityHall);
        System.out.println("Last Maintenance Date: " + lastMaintenanceDate);
        System.out.println("Monthly Maintenance Fee: $" + monthlyMaintenanceFee);
        System.out.println("Pet Friendly: " + petFriendly);
    }
}
