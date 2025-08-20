class Department{
	String depName;
	long phoneNumber;
	String email;
	int noOfFloor;
	int noOfBed;
	Doctor doctor;
	
	Department(){
		
	}
	
	Department(String depName,long phoneNumber,String email,int noOfFloor,int noOfBed,Doctor doctor){
		this.depName=depName;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.noOfFloor=noOfFloor;
		this.noOfBed=noOfBed;
		this.doctor=doctor;
	}
	public void getDepartmentInfo(){
		System.out.println("Department Information :");
		System.out.println();
		System.out.println("Department Name :" + depName);
		System.out.println("phoneNumber :" + phoneNumber);
		System.out.println("email :" + email);
		System.out.println("noOfFloor :" + noOfFloor);
		System.out.println("noOfBed :" + noOfBed);
		System.out.println();
		
		this.doctor.getDoctorInfo();
	}
}