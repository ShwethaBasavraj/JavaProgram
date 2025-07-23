class Bangalore{

		//External refrences
		
		static String chandralayout = "ChandraLayout";
		static String anything = "NagarBhavi";
		static String city = "ElectronicCity";
		static String nagar = "RRnagar";
		static String areaNames[]={anything,"VijayNagar",chandralayout,nagar,city};
		
		public static void main(String area[]){
		
		
		//System.out.println(areaNames[0]+" "+areaNames[1]);
		
		System.out.println(chandralayout);
		System.out.println(anything);
		System.out.println(nagar);
		System.out.println(city);
		System.out.println(" ");
		System.out.println("main Started");
        System.out.println("The area names are :");
						//internal refrences
						for(String areaName : areaNames)
							System.out.println(areaName);
						
						
						System.out.println("main ended");
		}
}