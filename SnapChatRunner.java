class SnapChatRunner{
	
	public static void main(String args[]){
	
		String userName="Shwetha2000"; 
		long phoneNumber=6362135479l;
		
		SnapChat.loginByUsingUserName(userName);
			System.out.println("User name :"+userName);
		SnapChat.loginByUsingPhoneNumber(phoneNumber);
			System.out.println("Phone number :"+phoneNumber);
	}
}