class HillStation{
	
	
	static String hillstation1 = "Nandi Hills";
	static String hillstation2 = "Coorg";
	static String hillstation3 = "YatiChikmagalursh";
	static String hillstation4 = "Sakleshpur";
	static String hillstation5 = "Wayand";
	static String hillstation6 = "Ooty";
	static String hillstation7 = "Kodaikanal";
	
		static String hillstations[]={hillstation1,hillstation2,hillstation3,hillstation4,hillstation5,hillstation6,hillstation7};
		
		public static void main(String names[]){
			
			System.out.println(hillstation1);
			System.out.println(hillstation2);
			System.out.println(hillstation3);
			System.out.println(hillstation4);
			System.out.println(hillstation5);
			System.out.println(hillstation6);
			System.out.println(hillstation7);
			
			System.out.println();
		//System.out.println(resorts[0]+" "+resorts[1]+" "+resorts[2]+" "+resorts[3]+" "+resorts[4]+" "+resorts[5]+" "+resorts[6]);
		
		for(String hillstation : hillstations){
			System.out.println(hillstation);
		}
	}
}