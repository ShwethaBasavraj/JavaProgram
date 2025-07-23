class Shop{
	
	public static void sell(String vegetable, String quantity){
		
		System.out.println(" selling started");
		
		Agent.purchase(vegetable,quantity);
		
		System.out.println(" selling ended");
	}
}