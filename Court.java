class Court{

    static String courtName;
    static String courtLocation;
    static String courtId;
	static String courtType;
    static int numberOfJudges;
	static int numberOfCourtrooms;
    static boolean hasOnlineFilingSystem;
	static String chiefJusticeName;
    static int totalCasesHandled;
    static int activeCases;
	static String workingHours;
    static boolean operatesOnWeekends;
    static boolean hasLibrary;
    static boolean hasHoldingCells;
	static String establishedYear;
    static String jurisdictionArea;
    static String contactEmail;
    static long contactPhone;
	static String lastMajorCase;
    static String lastHearingDate;

    public static void main(String[] args) {
      
        System.out.println("=== Court Information ===");
        System.out.println(courtName);
        System.out.println(courtId);
        System.out.println(courtType);
        System.out.println(numberOfJudges);
        System.out.println(numberOfCourtrooms);
        System.out.println(hasOnlineFilingSystem);
        System.out.println(chiefJusticeName);
        System.out.println(totalCasesHandled);
        System.out.println(activeCases);
        System.out.println(workingHours);
        System.out.println(operatesOnWeekends);
        System.out.println(hasLibrary);
        System.out.println(hasHoldingCells);
        System.out.println(establishedYear);
        System.out.println(jurisdictionArea);
        System.out.println(contactEmail);
        System.out.println(contactPhone);
        System.out.println(lastMajorCase);
        System.out.println(lastHearingDate);
		
		System.out.println();
		
	courtName = "Central District Court";
    courtLocation = "Raichur";
    courtId = "CRT202506";
	courtType = "Civil and Criminal";
    numberOfJudges = 12;
    numberOfCourtrooms = 8;
    hasOnlineFilingSystem = true;
	chiefJusticeName = "Miss Mayuri Hiremath";
    totalCasesHandled = 12500;
    activeCases = 350;
	workingHours = "09:00 AM - 05:00 PM";
    operatesOnWeekends = false;
    hasLibrary = true;
    hasHoldingCells = true;
	establishedYear = "1965";
    jurisdictionArea = "Raichur";
    contactEmail = "contact@centralcourt.gov";
    contactPhone = 1234567893l;
	lastMajorCase = "RenukaSwamy Case";
    lastHearingDate = "2025-06-10";
	
		System.out.println("=== Court Information ===");
        System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + courtLocation);
        System.out.println("Court ID: " + courtId);
        System.out.println("Court Type: " + courtType);
        System.out.println("Number of Judges: " + numberOfJudges);
        System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
        System.out.println("Online Filing System Available: " + hasOnlineFilingSystem);
        System.out.println("Chief Justice: " + chiefJusticeName);
        System.out.println("Total Cases Handled: " + totalCasesHandled);
        System.out.println("Active Cases: " + activeCases);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Operates on Weekends: " + operatesOnWeekends);
        System.out.println("Has Legal Library: " + hasLibrary);
        System.out.println("Has Holding Cells: " + hasHoldingCells);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Jurisdiction Area: " + jurisdictionArea);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Last Major Case: " + lastMajorCase);
        System.out.println("Last Hearing Date: " + lastHearingDate);

    }
}
