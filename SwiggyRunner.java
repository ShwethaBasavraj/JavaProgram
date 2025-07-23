class SwiggyRunner{
		
		public static void main(String args[]){
		
			String foodName ="Idli";
			double cost = Swiggy.search(foodName);
			System.out.println("the piece of "+foodName+" is "+cost);
			
			int quantity =3;
			double priceWithQuantity = Swiggy.search(foodName,quantity);
			System.out.println("the piece of "+foodName+" with quantity "+quantity +" is "+priceWithQuantity);
			
		}
}