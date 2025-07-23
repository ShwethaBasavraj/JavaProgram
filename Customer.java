class Customer{
	
	public static void buy(String vegetable, String quantity){
		
		System.out.println("The Customer start to buy the vegetables");
		
		Shop.sell(vegetable, quantity);
		
		System.out.println("The Customer ended to buy the vegetables");
	}
}