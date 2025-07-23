class Hospital{
	
	static String doctorName1 = "Manoj";
	static String doctorName2 = "Pavan";
	static String doctorName3 = "Yatish";
	static String doctorName4 = "Rakshitha";
	static String doctorName5 = "Prashanth";
	static String doctorName6 = "Shwetha";
	static String doctorName7 = "Basavaraj";
	static String doctorName8 = "Vasantha";
	static String doctorName9 = "Minchu";
	static String doctorName10 = "Vinutha";
	
		static String doctorsName[]={doctorName1,doctorName2,doctorName3,doctorName4,doctorName5,doctorName6,doctorName7,doctorName8,doctorName9,doctorName10};
		
		public static void main(String names[]){
		
					System.out.println("main Started");
					System.out.println("The Doctors names are :");
		
								System.out.println(doctorName1);
								System.out.println(doctorName2);
								System.out.println(doctorName3);
								System.out.println(doctorName4);
								System.out.println(doctorName5);
								System.out.println(doctorName6);
								System.out.println(doctorName7);
								System.out.println(doctorName8);
								System.out.println(doctorName9);
								System.out.println(doctorName10);
								System.out.println();	
						
		//System.out.println(doctorsName[0]+" "+doctorsName[1]+" "+doctorsName[2]+" "+doctorsName[3]+" "+doctorsName[4]+" "+doctorsName[5]+" "+doctorsName[6]+" "+doctorsName[7]+" "+doctorsName[8]+" "+doctorsName[9]);
	
		       for(String doctorName : doctorsName)
				   System.out.println(doctorName);
			   
				   System.out.println("main ended");
		
	}
}