class Speaker {
	
	static boolean isConnected;
	static int maxVolume = 7;
	static int currentVolume;
	static int minVolume;
	
	public static void onOrOff(){
		if(isConnected == false){
			isConnected =true;
		System.out.println("The Speakeri is turned on");
	}
	else{
		isConnected =false;
		System.out.println("The Speaker is turned off");
		
	}
	}

	
	public static void increaseVolume(){
		
		System.out.println("IncreaseVolume started");
			if(isConnected == true){
			
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
		System.out.println("The currentVolume is "+ currentVolume);
			}else{
				System.out.println("maxVolume reached");
			}
			}
		else{
			System.out.println("turn on the speaker");
		}
		
		
	}
		
	
		public static void decreaseVolume(){
		
		System.out.println("decreaseVolume started");
		if(isConnected == true){
			
			if(currentVolume >= minVolume){
				currentVolume = currentVolume - 1;
		System.out.println("The currentVolume is "+ currentVolume);
			}else{
				System.out.println("minVolume decreased");
			}
		}
		else{
			System.out.println("turn off the speaker");
		}
		
		
	}
}
