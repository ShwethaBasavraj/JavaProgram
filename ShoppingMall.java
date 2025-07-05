class ShoppingMall{

    static String mallName;
    static String mallLocation;
    static String mallId;
    static int numberOfShops;
    static int numberOfFloors;
    static boolean hasFoodCourt;
    static boolean hasCinema;
	static int parkingCapacity;
    static boolean hasValetParking;
    static boolean hasSecuritySystem;
    static int numberOfSecurityGuards;
	static String openingTime;
    static String closingTime;
    static boolean openOnWeekends;
    static String managerName;
    static String contactEmail;
    static long contactPhone;
    static String lastEventHeld;
    static String lastEventDate;
    static int dailyVisitorCount;
    static String mainAnchorStore;

    public static void main(String[] args) {
       
        System.out.println("=== Shopping Mall Information ===");
        System.out.println( mallName);
        System.out.println(mallLocation);
        System.out.println(mallId);
        System.out.println(numberOfShops);
        System.out.println(numberOfFloors);
        System.out.println(hasFoodCourt);
        System.out.println(hasCinema);
        System.out.println(parkingCapacity);
        System.out.println(hasValetParking);
        System.out.println(hasSecuritySystem);
        System.out.println(numberOfSecurityGuards);
        System.out.println(openingTime);
        System.out.println(closingTime);
        System.out.println(openOnWeekends);
        System.out.println(managerName);
        System.out.println(contactEmail);
        System.out.println(contactPhone);
        System.out.println(lastEventHeld);
        System.out.println(lastEventDate);
        System.out.println(dailyVisitorCount);
        System.out.println(mainAnchorStore);
		
		System.out.println();
		
		
	mallName = "Mantri square";
    mallLocation = "Malleshwarm";
    numberOfShops = 220;
    numberOfFloors = 8;
    hasFoodCourt = true;
    hasCinema = true;
	parkingCapacity = 1000;
    hasValetParking = true;
    hasSecuritySystem = true;
    numberOfSecurityGuards = 50;
	openingTime = "10:00 AM";
    closingTime = "11:00 PM";
    openOnWeekends = true;
    managerName = "Vijay Malya";
    contactEmail = "info@sunshinemall.com";
    contactPhone = 9876543219l;
    lastEventHeld = "Summer Fashion Fest";
    lastEventDate = "2025-06-01";
    dailyVisitorCount = 15000;
    mainAnchorStore = "Mantrimart HyperStore";
	
		
		System.out.println("=== Shopping Mall Information ===");
        System.out.println("Mall Name: " + mallName);
        System.out.println("Location: " + mallLocation);
        System.out.println("Mall ID: " + mallId);
        System.out.println("Number of Shops: " + numberOfShops);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Has Food Court: " + hasFoodCourt);
        System.out.println("Has Cinema: " + hasCinema);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("Valet Parking Available: " + hasValetParking);
        System.out.println("Security System Available: " + hasSecuritySystem);
        System.out.println("Number of Security Guards: " + numberOfSecurityGuards);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Open on Weekends: " + openOnWeekends);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Last Event Held: " + lastEventHeld);
        System.out.println("Last Event Date: " + lastEventDate);
        System.out.println("Daily Visitor Count: " + dailyVisitorCount);
        System.out.println("Main Anchor Store: " + mainAnchorStore);
    }
}
