class Radio{
	
	static String stationName;
	static float frequency;
	static int volume;
	static boolean isMuted;
	static String Radioband;
	
	public static boolean radioConfigured(String sName,String band,float freq,int vol,boolean muteStatus){
		
		boolean isRadioConfigured = false;
		boolean stationNameValid = false;
		boolean freqValid =  false;
		boolean volValid = false;
		boolean muteValid = false;
		boolean bandValid = false;
		
		if(sName != null){
			stationName = sName;
			stationNameValid = true;
		}else{
			System.out.println("give name is not valid");
		}
		
		
		if(freq >= 88.0 && freq <= 108.0){
			frequency = freq;
			freqValid = true;
		}else{
			System.out.println("Frequency is not valid. Must be between 88.0 and 108.0 MHz");
		}
		
		
		if(vol >= 1 && vol <= 100){
			volume = vol;
			volValid = true;
		}else{
			System.out.println("Volume is not valid.Must be between 1 and 100");
		}
		
		
		if(band != null){
			Radioband = band;
			bandValid = true;
		}else{
			System.out.println("Volume is not valid.Must be between 1 and 100");
		}
		
		isMuted = muteStatus;
        muteValid = true;
		
		 if (stationNameValid && freqValid && volValid && bandValid && muteValid) {
            isRadioConfigured = true;
        }

        return isRadioConfigured;
    }

	
	 public static void getRadioInfo() {
		System.out.println("Radio Station Name: " + stationName);
        System.out.println("Radio Frequency: " + frequency + " MHz");
        System.out.println("Radio Volume: " + volume);
        System.out.println("Radio Band: " + Radioband);
        System.out.println("Is Muted: " + isMuted);
    }	
	
}

