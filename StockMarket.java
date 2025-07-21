class StockMarket{

		static String stockNames[]={"P & G Hygiene","Colgate-Palmoliv","Nestle India","TCS","Glaxosmi. Pharma","Hindustan Zinc","Page Industries","Gillette India","Castrol India","Cams Services"};
		
		public static void main(String names[]){
		
		//System.out.println(stockNames[0]+" "+stockNames[1]+" "+stockNames[2]+" "+stockNames[3]+" "+stockNames[4]+" "+stockNames[5]+" "+stockNames[6]+" "+stockNames[7]+" "+stockNames[8]+" "+stockNames[9]);
	
		System.out.println("main Started");
						System.out.println("The Stocknames are :");
						
						for(String stockName : stockNames)
							System.out.println(stockName);
						
						
						System.out.println("main ended");
	}
}