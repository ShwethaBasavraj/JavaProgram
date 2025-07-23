class WaterTank {

	static int waterLevel;
	
	public static void main(String args[]){
		System.out.println("main started");
		
		fill(200);
		
		System.out.println("The current waterLevel is" +" "+waterLevel+ "ltr");
		System.out.println("main ended");
	}
	
	public static void fill(int addWater){
		System.out.println("fill started");
			waterLevel = waterLevel+addWater;
		System.out.println("fill ended");
		
	}
	
}
