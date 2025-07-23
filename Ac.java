class Ac{
	
	static boolean isConnected;
	static boolean isButtonOn;
	static int maxLevel = 3;
	static int minLevel;
	static int currentLevel;
	//static int minWaterLevel;
	//static int minWaterLevel;
	
	public static void plug(){
		
		if(isConnected == false){
			isConnected = true;
			
			System.out.println("plug is turned on");
		}
		else{
			isConnected =false;
			System.out.println("The plug is turned off");
		}		
	}
	
	public static void onOrOff(){
		
		if(isButtonOn == false){
			isButtonOn = true;
			
			System.out.println("button is turned on");
		}
		else{
			isButtonOn = false;
			System.out.println("button is turned off");
		}
	}
	
	public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
		
		if(isButtonOn==true){
			
			if(currentLevel < maxLevel){
				currentLevel = currentLevel+1;
				System.out.println("currentLevel is" +currentLevel);
				
			}
			
			else{
				System.out.println("maxLevel is reached");
			}
					
		}
		else{
			System.out.println("TurnOn the AC");
			System.out.println("increaseSpeed ended");
		}
	}
	
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed started");
		
		if(isButtonOn == true){
			if(currentLevel >= minLevel){
				currentLevel = maxLevel -1;
				
				System.out.println("currentLevel is" +currentLevel);		
			}
			else{
				System.out.println("minLevel is reached");
			}
		}
		else{
			System.out.println("TurnOff the AC");
		}
	}
}
