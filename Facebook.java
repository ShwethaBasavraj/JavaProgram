class Facebook{

	static String fullName;
	static long phoneNumber;
	static String password;
	static String dOb;
	static String gender;
	static String email;
	static String confirmPass;


public static boolean createAccount(String fName ,String dob ,String gD,
									long phNo, String mail, String pass 
								   ,String cPass){

     //validation 

		boolean isUserRegisterd = false;
		boolean fNameValid = false;
		boolean phNoValid = false;
		boolean passValid = false;
		boolean genderValid =  false;
		boolean emailValid =false;
		boolean dobValid = false;
		boolean cPassValid = false;
		
			if(fName != null){
				fullName	= fName;
				fNameValid = true;
				}

			if (gD !=null){
				gender =gD;
				genderValid = true;
				}

			if (dob != null){
				dOb = dob;
				dobValid = true;
				}
				
			if (phNo > 0  ){
				phoneNumber = phNo;
				phNoValid = true;			
			}
			
			if (pass != null && !pass.isEmpty()) {
				password = pass;
				passValid = true;
			}

			if (cPass !=null){
				confirmPass = cPass;
				cPassValid = true;
			}



			if (mail != null)
			{
			 email = mail;
			emailValid = true;
			}


	
			
	if (fNameValid == true && genderValid == true && passValid == true && emailValid == 
	true && cPassValid == true && dobValid == true && phNoValid == true   )
	{
	isUserRegisterd =true;
	}

	return isUserRegisterd;

}


	public static void getUserInfo(){
		

	System.out.println(" the first name is " + fullName );
	System.out.println(" the sur name is " + phoneNumber );
	System.out.println("Password is set: " + password);
	System.out.println("date of birth is set: " + dOb);
	System.out.println("gender is set: " + gender);
	System.out.println("email is set: " + email);
	System.out.println("confirm Password is set: " + confirmPass);

	}

}