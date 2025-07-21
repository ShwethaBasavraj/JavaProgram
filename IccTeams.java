class IccTeams{

	static String cricketTeam1 = "India";
	static String cricketTeam2 = "England";
	static String cricketTeam3 = "Australia";
	static String cricketTeam4 = "Bangladesh";
	static String cricketTeam5 = "Canada";
	
	static String cricketTeams[] = {cricketTeam1,cricketTeam2,cricketTeam3,cricketTeam4,cricketTeam5};
							
	public static void main(String team[]){
		
	System.out.println("main Started");
	System.out.println(cricketTeams[0]+ " "+cricketTeams[1]);
	System.out.println(cricketTeam1);
	System.out.println(cricketTeam2);
	System.out.println(cricketTeam3);
	System.out.println(cricketTeam4);
	System.out.println(cricketTeam5);
	System.out.println();
	
		 for(String cricketTeam : cricketTeams)
			 System.out.println(cricketTeam);
		 
		System.out.println("main ended");
	}
}