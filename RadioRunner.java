class RadioRunner{
	
	public static void main(String args[]){
	
		//boolean isRadioConfigured = Radio.radioConfigured("98.mirchi","FM",104.6,75,true);
		boolean isRadioConfigured = Radio.radioConfigured("98.mirchi", "FM", 104.6f, 75, true);
			System.out.println("Radio Configuration :" +isRadioConfigured);
			
			Radio.getRadioInfo();
	}
}

