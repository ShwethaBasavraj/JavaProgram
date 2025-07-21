class Earth{
	
	static String continent1 = "Asia";
	static String continent2 = "Africa";
	static String continent3 = "Europe";
	static String continent4 = "North America";
	static String continent5 = "South America";
	static String continent6 = "Australia";
	static String continent7 = "Antarctica";
	
		static String continents[]={continent1,continent2,continent3,continent4,continent5,continent6,continent7};
		
		
		public static void main(String names[]){
		
		//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);
	
		System.out.println("main Started");
			System.out.println("The continents are :");
		
			System.out.println(continent1);
			System.out.println(continent2);
			System.out.println(continent3);
			System.out.println(continent4);
			System.out.println(continent5);
			System.out.println(continent6);
			System.out.println(continent7);
			System.out.println();
						
						
						for(String continent : continents)
							System.out.println(continent);
						
						
						System.out.println("main ended");
	}
}