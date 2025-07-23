class Doctors{
	public static void treatment(String patientName, int age, String sickness){
		System.out.println("Treatment started");
		
		Nurse.assist(patientName,age,sickness);
		
		System.out.println("Treatment ended");
	}
	
}
