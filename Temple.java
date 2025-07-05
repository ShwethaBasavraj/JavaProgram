class Temple{

    static String templeName;
    static String templeLocation;
    static String templeId;
	static String godNames ;
    static int yearEstablished;
    static String architectureStyle;
    static boolean hasPrayerHall;
    static int dailyVisitors;
    static boolean hasAccommodation;
    static int numberOfPriests;
    static boolean open24Hours; 
	static String mainFestival;
    static String festivalMonth;
    static boolean hasCommunityKitchen;
    static boolean allowsPhotography;
	static String headPriestName;
    static String contactEmail;
    static long contactPhone;
	static boolean hasParking;
    static boolean hasLibrary;
    static boolean hasMeditationCenter;

    public static void main(String[] args) {

        System.out.println("=== Temple Information ===");
        System.out.println(templeName);
        System.out.println(templeLocation);
        System.out.println( templeId);
        System.out.println(godNames);
        System.out.println(yearEstablished);
        System.out.println(architectureStyle);
        System.out.println(hasPrayerHall);
        System.out.println(dailyVisitors);
        System.out.println(hasAccommodation);
        System.out.println(numberOfPriests);
        System.out.println(open24Hours);
        System.out.println(mainFestival);
        System.out.println(festivalMonth);
        System.out.println(hasCommunityKitchen);
        System.out.println(allowsPhotography);
        System.out.println(headPriestName);
        System.out.println(contactEmail);
        System.out.println(hasParking);
        System.out.println(hasLibrary);
        System.out.println(hasMeditationCenter);
		
		System.out.println();
	
	templeName = "Shri Lakshmi Narayan Temple";
    templeLocation = "Teachers colony  Nagarbhavi";
    templeId = "TEMP202506";
	godNames = "Lord Vishnu and Goddess Lakshmi";
    yearEstablished = 1892;
    architectureStyle = "Dravidian";
    hasPrayerHall = true;
    dailyVisitors = 5000;
    hasAccommodation = true;
    numberOfPriests = 8;
    open24Hours = false; 
	mainFestival = "Diwali";
    festivalMonth = "October-November";
    hasCommunityKitchen = true;
    allowsPhotography = false;
	headPriestName = "Swami Ramananda";
    contactEmail = "info@lakshminarayan.org";
    contactPhone = 2878369741l;
	hasParking = true;
    hasLibrary = true;
    hasMeditationCenter = true;
	
		System.out.println("=== Temple Information ===");
        System.out.println("Temple Name: " + templeName);
        System.out.println("Location: " + templeLocation);
        System.out.println("Temple ID: " + templeId);
        System.out.println("GodNames: " + godNames);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Architecture Style: " + architectureStyle);
        System.out.println("Has Prayer Hall: " + hasPrayerHall);
        System.out.println("Daily Visitors: " + dailyVisitors);
        System.out.println("Has Accommodation: " + hasAccommodation);
        System.out.println("Number of Priests: " + numberOfPriests);
        System.out.println("Open 24 Hours: " + open24Hours);
        System.out.println("Main Festival: " + mainFestival);
        System.out.println("Festival Month: " + festivalMonth);
        System.out.println("Has Community Kitchen: " + hasCommunityKitchen);
        System.out.println("Allows Photography: " + allowsPhotography);
        System.out.println("Head Priest Name: " + headPriestName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Has Parking: " + hasParking);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("Has Meditation Center: " + hasMeditationCenter);
    }
}
