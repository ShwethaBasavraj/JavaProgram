class PoliceStation {
    static String stationName;
    static String stationID;
    static String headOfficer;
    static int totalOfficers;
    static int totalCases;
    static String patrolVehicle;
    static String complaintType;
    static String suspectName;
    static String victimName;
    static String caseStatus;
    static String firNumber;
    static String evidenceItem;
    static String lockupStatus;
    static String dutySchedule;
    static String interrogationRoom;
    static String cctvStatus;
    static String chargeSheet;
    static String forensicReport;
    static int emergencyContact;
    static String dispatchTime;

    public static void main(String[] args) {
		
		System.out.println("=== POLICE STATION DETAILS ===");
        System.out.println(stationName);
        System.out.println(stationID);
        System.out.println(headOfficer);
        System.out.println(totalOfficers);
        System.out.println(totalCases);
        System.out.println(patrolVehicle);
        System.out.println(complaintType);
        System.out.println(suspectName);
        System.out.println(victimName);
        System.out.println(caseStatus);
        System.out.println(firNumber);
        System.out.println(evidenceItem);
        System.out.println(lockupStatus);
        System.out.println(dutySchedule);
        System.out.println(interrogationRoom);
        System.out.println(cctvStatus);
        System.out.println(chargeSheet);
        System.out.println(forensicReport);
        System.out.println(emergencyContact);
        System.out.println(dispatchTime);
		
		System.out.println();;

		stationName = "Central Police Station";
		stationID = "CPS101";
		headOfficer = "Yogiji";
		totalOfficers = 25;
		totalCases = 512;
		patrolVehicle = "Mahindra Bolero";
		complaintType = "Theft";
		suspectName = "Ravi Kumar";
		victimName = "Anita";
		caseStatus = "Under Investigation";
		firNumber = "FIR2024/107";
		evidenceItem = "Knife";
		lockupStatus = "Occupied";
		dutySchedule = "24x7 Shift";
		interrogationRoom = "Room 3";
		cctvStatus = "Active";
		chargeSheet = "Filed";
		forensicReport = "Pending";
		emergencyContact = 100;
		dispatchTime = "2:40";
	
	
        System.out.println("=== POLICE STATION DETAILS ===");
        System.out.println("Station Name: " + stationName);
        System.out.println("Station ID: " + stationID);
        System.out.println("Head Officer: " + headOfficer);
        System.out.println("Total Officers: " + totalOfficers);
        System.out.println("Total Cases: " + totalCases);
        System.out.println("Patrol Vehicle: " + patrolVehicle);
        System.out.println("Complaint Type: " + complaintType);
        System.out.println("Suspect Name: " + suspectName);
        System.out.println("Victim Name: " + victimName);
        System.out.println("Case Status: " + caseStatus);
        System.out.println("FIR Number: " + firNumber);
        System.out.println("Evidence Item: " + evidenceItem);
        System.out.println("Lockup Status: " + lockupStatus);
        System.out.println("Duty Schedule: " + dutySchedule);
        System.out.println("Interrogation Room: " + interrogationRoom);
        System.out.println("CCTV Status: " + cctvStatus);
        System.out.println("Charge Sheet: " + chargeSheet);
        System.out.println("Forensic Report: " + forensicReport);
        System.out.println("Emergency Contact: " + emergencyContact);
        System.out.println("Dispatch Time: " + dispatchTime);
    }
}