class HospitalRunner{
	public static void main(String hsptl[]){
		
		Doctor doctor = new Doctor();
		
		doctor.docName ="Dr. Veeresh";
		doctor.specialization="Cardiology";
		doctor.departmentName="Heart Care Department";
		
		Department department = new Department("Cardiology",6362135473l,"Veer@gmail.com",20,200,doctor);
		
		Hospital hospital = new Hospital("Veer Heart Care","Sindhnur",false,40,8,department);
		
		hospital.getHospitalInfo();
		
		
	}
}
