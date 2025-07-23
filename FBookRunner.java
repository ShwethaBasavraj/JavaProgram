class FBookRunner{
	
	public static void main(String args[]){
			
		boolean isLogined = Facebook.loginAccount("baba@gmail.com","baba@1234");
			System.out.println("is logined Account :"+isLogined );
			
		Facebook.getUserInfo();
	}
}