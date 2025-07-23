
class InstaRunner{
	
	public static void main(String args[]){
	
		String userName="Shwetha2000"; 
		String email="Shwe@gmail.com";
		long phoneNumber=6362135479l;
		
		Insta.loginByUsingUserName(userName,email);
			System.out.println("login Instagram :"+userName+","+email);
			
		Insta.loginByUsingPhoneNumber(phoneNumber);
			System.out.println("Phone number :"+phoneNumber);
	}
}

