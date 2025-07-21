class Hospital{
	
	//Hospital Details
	
	static int hospitalId =1;
	static String hospitalName="Appolo Hospital";
	static String hospitalType="Multi Speciality";
	static int noOfFloors=12;
	static String address="Rajajinagar";
	
	public static void main(String hospital[]){
	//static String address="Rajajinagar";[will get error--> illegal start of expression]
		
	
	System.out.println("The Hospital reference is:"+ hospitalId);
	System.out.println("The Hospital name is:"+ hospitalName);
	System.out.println("The Hospital type is:"+ hospitalType);
	System.out.println("The no of floors available:"+ noOfFloors);
	System.out.println("The address is:"+ address);
	}
}