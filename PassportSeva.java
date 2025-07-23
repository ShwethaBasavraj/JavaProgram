class PassportSeva{

	static String givenName ;
	static String surName;
	static String password;
	static String confirmPassword;
	
	public static boolean PassportSeva(String gName, String sName, String pwd, String cPwd ){
		
		boolean isUserRegistered = false;
		boolean giveNameValid = false;
		boolean surNameValid = false;
		boolean pwdValid = false;
		boolean cPwdValid = false;
		
	if(gName != null){                                                                                                                                    
		givenName = gName;
		giveNameValid = true;
	}else{
		System.out.println("given name is not valid ");
	}
	
	if(sName != null){
		surName = sName;
		surNameValid = true;
	}else{
		System.out.println("surName is not valid ");		
	}
	
	
	if(pwd != null && !pwd.isEmpty() ){
		password = pwd;
		pwdValid = true;
	}else{
		System.out.println("password is not valid ");		
	}
	
	if(cPwd != null && pwd == cPwd){
		confirmPassword = cPwd;
		cPwdValid = true;
	}else{
		System.out.println("password is not valid ");		
	}
	

	
	if(giveNameValid == true && surNameValid == true && pwdValid == true && cPwdValid == true ){
		isUserRegistered =true;
	}
		return isUserRegistered;	
	}
	
	public static void getUserInfo(){
		System.out.println("The given name is "+ givenName );
		System.out.println("The given surName is "+ surName );
		System.out.println("The given password is "+ password );
		System.out.println("The given cPwd is "+ confirmPassword);
	}
	
}