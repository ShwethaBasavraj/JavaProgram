class Hospital {
	String hospitalName;
	String location;
	boolean isGovtHospital;
	int noOfworkers;
	int noOfDoctorsWorking;
	Department department;
	
	Hospital(){
		
	}
	
	Hospital(String hospitalName,String location,boolean isGovtHospital,int noOfworkers,int noOfDoctorsWorking,Department department){
		this.hospitalName=hospitalName;
		this.location=location;
		this.isGovtHospital=isGovtHospital;
		this.noOfworkers=noOfworkers;
		this.noOfDoctorsWorking=noOfDoctorsWorking;
		this.department=department;
	}
	
	public void getHospitalInfo(){
		System.out.println("Hospital Information :");
		System.out.println();
		System.out.println("Hospital Name :" + hospitalName);
		System.out.println("Hospital Area :" + location);
		System.out.println("isGovtHospital :" + isGovtHospital);
		System.out.println("No of workers in library :" + noOfworkers);
		System.out.println("No of doctors working :" + noOfDoctorsWorking);
		System.out.println();
		
		this.department.getDepartmentInfo();
	}
}