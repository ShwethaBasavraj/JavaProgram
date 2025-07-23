class PlayStation{
	
	
	static String Station1 = "Cricket";
	static String Station2 = "FootBall";
	static String Station3 = "VolleyBall";
	static String Station4 = "Chess";
	static String Station5 = "Hockey";
	static String Station6 = "Badmintion";
	static String Station7 = "ThroughBall";
	static String Station8 = "Running";
	static String Station9 = "kabadi";
	static String Station10 = "BasketBall";
	
	
		static String games[]={Station1,Station2,Station3,Station4,Station5,Station6,Station7,Station8,Station9,Station10};
		
		public static void main(String names[]){
		
		//System.out.println(games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]);
		
		System.out.println("main Started");
						System.out.println("The available games are :");
						
						System.out.println(Station1);
						System.out.println(Station2);
						System.out.println(Station3);
						System.out.println(Station4);
						System.out.println(Station5);
						System.out.println(Station6);
						System.out.println(Station7);
						System.out.println(Station8);
						System.out.println(Station9);
						System.out.println(Station10);
						
						System.out.println();
						
						for(String game : games)
							System.out.println(game);
						
						
						System.out.println("main ended");
	
	}
}