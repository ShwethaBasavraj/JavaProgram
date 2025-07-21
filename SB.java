class SB{

	 static String switchboardName;
     static String switchboardCode;
     static String address;
     static String city;
     static String state;
     static String zipCode;
     static long phoneNumber;
     static String email;
     static String operationalArea;
     static String establishedDate;
     static int totalStaff;
     static int numberOfOperators;
     static String managerName;
     static String supervisorName1;
     static String supervisorName2;
     static String supervisorName3;
     static String mainConsole;
     static String backupConsole;
     static int totalCallsHandled;
     static double averageCallDuration;
	 
	 public static void main(String board[]){
	
		System.out.println("=== Switchboard Details ===");
        System.out.println(switchboardName);
        System.out.println(switchboardCode);
        System.out.println(address);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);
        System.out.println(phoneNumber);
        System.out.println(email);
        System.out.println(establishedDate);
        System.out.println(totalStaff);
        System.out.println(numberOfOperators);
        System.out.println(managerName);
        System.out.println(supervisorName1);
        System.out.println(supervisorName2);
        System.out.println(supervisorName3);
        System.out.println(mainConsole);
        System.out.println(backupConsole);
        System.out.println(totalCallsHandled);
        System.out.println(averageCallDuration);
		
		System.out.println();
		
	 switchboardName="Bangalore Switchboard";
	 switchboardCode="CCSB-2025";
     address="789 Vijaynagar food Street";
     city="Bangalore";
     state="Karnataka";
     zipCode="560040";
     phoneNumber=3691473694l;
     email="support@bangaloresb.gov";
     operationalArea="Downtown & West End";
     establishedDate="LocalDate.of(2000/10/22)";
     totalStaff=45;
     numberOfOperators=30;
     managerName="ABC";
     supervisorName1="DEF";
     supervisorName2="HIJ";
     supervisorName3="KLM";
     mainConsole="Model XZ-100";
     backupConsole="Model XZ-90";
     totalCallsHandled=15000;
     averageCallDuration=3.8;
	 
		
		System.out.println("=== Switchboard Details ===");
        System.out.println("Switchboard Name: " + switchboardName);
        System.out.println("Switchboard Code: " + switchboardCode);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZIP Code: " + zipCode);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Operational Area: " + operationalArea);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Number of Operators: " + numberOfOperators);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Supervisor 1: " + supervisorName1);
        System.out.println("Supervisor 2: " + supervisorName2);
        System.out.println("Supervisor 3: " + supervisorName3);
        System.out.println("Main Console: " + mainConsole);
        System.out.println("Backup Console: " + backupConsole);
        System.out.println("Total Calls Handled: " + totalCallsHandled);
        System.out.println("Average Call Duration (minutes): " + averageCallDuration);
    }
}



        

    