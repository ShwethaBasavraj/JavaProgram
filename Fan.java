class Fan{
	static boolean isButtonOn;
	static int maxSpeed = 5;
	static int currentSpeed;
	static int minSpeed;
	
	public static void isOnOrOff(){
		
		if(isButtonOn == false){
			isButtonOn = true;
			System.out.println("The fan is turned on");
		}
		else{
			isButtonOn = false;
			System.out.println("The fan is turned off");
		}
	}
	
	public static void increaseSpeed(){
		System.out.println("IncreaseSpeed Started");
			if(isButtonOn == true){
				
				if(currentSpeed < maxSpeed){
					currentSpeed = currentSpeed +1;
					
				System.out.println("The currentSpeed is " + currentSpeed);				
				}
				else{
				System.out.println("maxSpeed reached");
				}
			}
				else{
				System.out.println("Turn on the fan");
				}
	}
	
	public static void decreaseSpeed(){
		System.out.println("decrease the speed");
			if(isButtonOn == false){
				
				if(currentSpeed >= minSpeed){
				   currentSpeed =currentSpeed - 1;
				   
				System.out.println("The currentSpeed is "+ currentSpeed);
				}
				else{
					System.out.println("The minSpeed is decreased");
					 
				}
			}
			else{
				System.out.println("Turn off the fan");
			}
	}
	
}



