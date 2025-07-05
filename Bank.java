class Bank {

	static String bankName;
    static String branchCode;
    static String branchAddress;
    static String city;
    static String state;
    static long zipCode;
    static long contactNumber;
    static String email;
    static String ifscCode;
    static String establishedDate;
    static int totalEmployees;
    static int numberOfTellers;
    static String branchManagerName;
    static String assistantManagerName;
    static String headCashierName;
    static String customerServiceRepName;
    static int totalAccounts;
    static int totalLoans;
    static double totalDeposits;
    static double totalLoansIssued;
    static double averageTransactionValue;
	
	public static void main (String bank[]){
		
        System.out.println("=== Bank Branch Details ===");
        System.out.println(bankName);
        System.out.println(branchCode);
        System.out.println(branchAddress);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);
        System.out.println(contactNumber);
        System.out.println(email);
        System.out.println(ifscCode);
        System.out.println(establishedDate);
        System.out.println(totalEmployees);
        System.out.println(numberOfTellers);
        System.out.println(branchManagerName);
        System.out.println(assistantManagerName);
        System.out.println(headCashierName);
        System.out.println(customerServiceRepName);
        System.out.println(totalAccounts);
        System.out.println(totalLoans);
        System.out.println(totalDeposits);
        System.out.println(totalLoansIssued);
        System.out.println(averageTransactionValue);
		
		System.out.println();
		
		bankName="Karnataka Bank";
    branchCode="SND001";
    branchAddress="101 Finance Avenue";
    city="Sindhnur";
    state="Karnataka";
    zipCode=584128l;
    contactNumber=1478963214l;
    email="support@kbbank.com";
    ifscCode="support@kbbank.com";
    establishedDate="LocalDate.of(2000/10/22)";
    totalEmployees=75;
    numberOfTellers=15;
    branchManagerName="Shwetha";
    assistantManagerName="Ananya";
    headCashierName="Akshatha";
    customerServiceRepName="Mr Deshpande";
    totalAccounts=5000;
    totalLoans=1200;
    totalDeposits=12500000.50;
    totalLoansIssued=7400000.75;
    averageTransactionValue=312.45;
	
		System.out.println("=== Bank Branch Details ===");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("Branch Address: " + branchAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZIP Code: " + zipCode);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Number of Tellers: " + numberOfTellers);
        System.out.println("Branch Manager: " + branchManagerName);
        System.out.println("Assistant Manager: " + assistantManagerName);
        System.out.println("Head Cashier: " + headCashierName);
        System.out.println("Customer Service Rep: " + customerServiceRepName);
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Loans: " + totalLoans);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Loans Issued: $" + totalLoansIssued);
        System.out.println("Average Transaction Value: $" + averageTransactionValue);
    }
}