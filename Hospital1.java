class Hospital1{
	public static void checkUp(String patientname, int age, long phoneNumber, String email, String sickness){
		
		System.out.println("checkUp started");
		
		Doctors.treatment(patientname,age,sickness);
		
		
		System.out.println("CheckUp is done");
	}
}