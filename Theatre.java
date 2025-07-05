class Theatre{

    static String theatreName;
    static String theatreLocation;
    static String theatreId;
	static int seatingCapacity;
    static int numberOfScreens; 
    static boolean hasBalcony ;
    static boolean hasVIPSeating;
    static boolean hasDolbySound;
    static boolean has3DProjection;
    static String stageType;
    static boolean hasBackstageAccess;
    static String managerName;
    static String contactEmail;
    static long contactPhone;
    static String lastShowName;
    static String lastShowDate;
    static int lastShowAudience;
    static String openingTime;
    static String closingTime;
    static boolean openOnWeekends;

    public static void main(String[] args) {
       
        System.out.println("=== Theatre Information ===");
        System.out.println(theatreName);
        System.out.println(theatreLocation);
        System.out.println(theatreId);
		System.out.println(seatingCapacity);
        System.out.println(numberOfScreens);
        System.out.println(hasBalcony);
        System.out.println(hasVIPSeating);
        System.out.println(hasDolbySound);
        System.out.println(has3DProjection);
        System.out.println(stageType);
        System.out.println(hasBackstageAccess);
        System.out.println(managerName);
        System.out.println(contactEmail);
        System.out.println(contactPhone);
        System.out.println(lastShowName);
        System.out.println(lastShowDate);
        System.out.println(lastShowAudience);
        System.out.println(openingTime);
        System.out.println(closingTime);
        System.out.println( openOnWeekends);
		
		System.out.println();
		
		
	theatreName = "PVR";
    theatreLocation = "GT WORLD MALL, Bangalore";
    theatreId = "THEATRE202506";
    seatingCapacity = 1200;
    numberOfScreens = 5; 
    hasVIPSeating = true;
    hasDolbySound = true;
    has3DProjection = true;
    stageType = "Proscenium";
    hasBackstageAccess = true;
    managerName = "Gotilla";
    contactEmail = "contact@gtpvrtheatre.com";
    contactPhone = 2147896321l;
    lastShowName = "Chhaava";
    lastShowDate = "2025-02-18";
    lastShowAudience = 1150;
    openingTime = "10:00 AM";
    closingTime = "11:00 PM";
    openOnWeekends = true;
	
	
		System.out.println("=== Theatre Information ===");
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + theatreLocation);
        System.out.println("Theatre ID: " + theatreId);
		System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Has Balcony: " + hasBalcony);
        System.out.println("Has VIP Seating: " + hasVIPSeating);
        System.out.println("Dolby Sound System: " + hasDolbySound);
        System.out.println("3D Projection Available: " + has3DProjection);
        System.out.println("Stage Type: " + stageType);
        System.out.println("Backstage Access Available: " + hasBackstageAccess);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Last Show Name: " + lastShowName);
        System.out.println("Last Show Date: " + lastShowDate);
        System.out.println("Audience at Last Show: " + lastShowAudience);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Open on Weekends: " + openOnWeekends);
    }
}

