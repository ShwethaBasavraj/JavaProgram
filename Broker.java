class Broker{
	public static void brokerage(String vegetable, String quantity){
		System.out.println("The Broker started the brokerageing the vegetable");
		
		Farmer.farm(vegetable,quantity);
		
		System.out.println("The Broker ended the brokerageing the vegetable");
	}
}