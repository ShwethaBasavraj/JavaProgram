class EmailRunner{
	

	public static void main(String args[]){
		
		
		String email = "Shwetha@gmail.com";
        String pwd = "Shwe@123";
		
	     Email.tryToLoginByUsingMailId(email,pwd);
			System.out.println("login by using mail-id :"+ email +","+ pwd);
		
		long phoneNumber = 6362135473l;
		String pwd2 = "Shwe@123";
			
		 Email.tryToLoginByUsingPhoneNumber(6362195473l,"Shwe@123");
			System.out.println("login by using phoneNumber :"+ phoneNumber +","+pwd2);
	}
	
	
}

