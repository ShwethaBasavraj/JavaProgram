class FacebookRunner{
	
	public static void main(String args[]){
		
		boolean isUserRegisterd = Facebook.createAccount("Shwetha","26/08/2000","Female",6362135473l,"Shwe@gmail.com","Shwe@123","Shwe@123" );
				System.out.println("is User Registered & :" +  isUserRegisterd);
				
				
		Facebook.getUserInfo();
			
		}
}
