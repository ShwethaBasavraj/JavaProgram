class PassportSevaRunner{

	public static void main(String seva[]){
		
		boolean isUserRegisterd = PassportSeva.PassportSeva("Shwetha","Hiremath","Shwe@123","Shwe@123");
		//boolean isUserRegisterd = PassportSeva.PassportSeva("Shwetha",null,"Shwetha@123","shwe@123");
				System.out.println("Is user registered "+ isUserRegisterd);
				
			if(isUserRegisterd)
		PassportSeva.getUserInfo();
	}
}