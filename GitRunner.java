class GitRunner{
	
	public static void main(String args[]){
	
		String userName="Shwetha2000"; 
		String email="Shwe@gmail.com";
		long phoneNumber=6362135479l;
		
		//SnapChat.loginByUsingUserName(userName);
			//System.out.println("User name :"+userName);
		SnapChat.loginByUsingUserName(email);
			System.out.println("User name :"+email);
			
		SnapChat.loginByUsingPhoneNumber(phoneNumber);
			System.out.println("Phone number :"+phoneNumber);
	}
}