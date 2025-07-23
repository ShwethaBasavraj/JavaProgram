class FanRunner{
	public static void main(String args[]){
	
		System.out.println("main started");
		
		Fan.isOnOrOff();
		Fan.increaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.increaseSpeed();
		
		System.out.println("main ended");
	}
}