class City{

		static int pinCodes[]={584123,960001,960002,960004,960005,960006,960006,960007,960008,960009};
		
		public static void main(String codes[]){
		
		System.out.println("Main Started");
		System.out.println("Area Codes Are available here:");
		
		//System.out.println(pinCodes[0]+" "+pinCodes[1]+" "+pinCodes[2]+" "+pinCodes[3]+" "+pinCodes[4]+" "+pinCodes[5]+" "+pinCodes[6]+" "+pinCodes[7]+" "+pinCodes[8]+" "+pinCodes[9]);
					
		for(int pinCode : pinCodes)
				System.out.println(pinCode);
			
			System.out.println("main ended");
					
				
	}
}