class FBook{
	
	
	static String emailId;
	static String password;
	
	public static boolean loginAccount(String email, String pwd){
		
		boolean isLogined = false;
		boolean emailValid = false;
		boolean passwordVaild =false;
		
		if(email != null){
			emailId = email;
			emailValid = true;	
		}
		
		if(pwd != null){
			password = pwd;
			passwordVaild = true;
		}
		
		if(emailValid == true && passwordVaild == true){
			isLogined = true;
		}
			return isLogined ;
	}
	
	public static void getUserInfo(){
		System.out.println("The given email is "+ emailId );
		System.out.println("The given password is "+ password );
	}
	
}


