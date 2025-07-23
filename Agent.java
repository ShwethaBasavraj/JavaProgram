class Agent{

	public static void purchase(String vegetable, String quantity){
		System.out.println("The Agent start to purchase the vegetables ");
		
		Broker.brokerage(vegetable,quantity);
		
		System.out.println("The Agent ended to purchase the vegetables ");
	}
}