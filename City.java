class City{
	

	static int pinCode1=584123;
	static int pinCode2=960001;
	static int pinCode3=960002;
	static int pinCode4=960004;
	static int pinCode5=960005;
	static int pinCode6=960006;
	static int pinCode7=960006;
	static int pinCode8=960007;
	static int pinCode9=960008;
	static int pinCode10=960009;
	
		static int pinCodes[]={pinCode1,pinCode2,pinCode3,pinCode4,pinCode5,pinCode6,pinCode7,pinCode8,pinCode9,pinCode10};
		
		public static void main(String codes[]){
		
		System.out.println("Main Started");
		System.out.println("Area Codes Are available here:");
		
			System.out.println(pinCode1);
			System.out.println(pinCode2);
			System.out.println(pinCode3);
			System.out.println(pinCode4);
			System.out.println(pinCode5);
			System.out.println(pinCode6);
			System.out.println(pinCode7);
			System.out.println(pinCode8);
			System.out.println(pinCode9);
			System.out.println(pinCode10);
			System.out.println();
			
		
		//System.out.println(pinCodes[0]+" "+pinCodes[1]+" "+pinCodes[2]+" "+pinCodes[3]+" "+pinCodes[4]+" "+pinCodes[5]+" "+pinCodes[6]+" "+pinCodes[7]+" "+pinCodes[8]+" "+pinCodes[9]);
					
		for(int pinCode : pinCodes)
				System.out.println(pinCode);
			
			System.out.println("main ended");
					
				
	}
}