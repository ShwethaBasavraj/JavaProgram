class Stadium{

    
    static String stadiumName = "National Arena";
    static String stadiumLocation = "Bangalore";
    static String stadiumId = "STD202506";
	static int seatingCapacity = 55000;
    static int numberOfGates = 20;
    static int numberOfSecurityStaff = 150;
	static boolean hasRoof = true;
    static boolean hasLEDScreens = true;
    static boolean hasParkingLot = true;
    static boolean hasVIPLounge = true;
	static String homeTeam = "City FC";
    static String fieldType = "Natural Grass";
    static double fieldLength = 105.0; // in meters
    static double fieldWidth = 68.0; // in meters
	static String lastEventName = "City FC vs United Stars";
    static String lastEventDate = "2025-06-15";
    static int lastEventAttendance = 52000;
	static String managerName = "Sophia Reynolds";
    static String contactEmail = "info@nationalarena.com";
	static long contactPhone = 6362135473l;

    public static void main(String[] args) {
       
        System.out.println("=== Stadium Information ===");
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Location: " + stadiumLocation);
        System.out.println("Stadium ID: " + stadiumId);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Number of Gates: " + numberOfGates);
        System.out.println("Security Staff: " + numberOfSecurityStaff);
        System.out.println("Roof Available: " + hasRoof);
        System.out.println("LED Screens Installed: " + hasLEDScreens);
        System.out.println("Parking Lot Available: " + hasParkingLot);
        System.out.println("VIP Lounge Available: " + hasVIPLounge);
        System.out.println("Home Team: " + homeTeam);
        System.out.println("Field Type: " + fieldType);
        System.out.println("Field Dimensions: " + fieldLength + "m x " + fieldWidth + "m");
        System.out.println("Last Event: " + lastEventName);
        System.out.println("Last Event Date: " + lastEventDate);
        System.out.println("Attendance at Last Event: " + lastEventAttendance);
        System.out.println("Manager: " + managerName);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
    }
}
