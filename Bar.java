class Bar{
		
		static String alcoholNames[]={"Vodka","Gin","Rum","Whiskey ","Tequila","Brandy ","Beer","Wine ","Cider ","Sake ","Cognac","Absinthe"};
									
									
							public static void main(String juice[]){
							
							/*System.out.println(alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]+" "+alcoholNames[6]+" "+alcoholNames[7]+" "+alcoholNames[8]+" "+
							 alcoholNames[9]+" "+alcoholNames[10]+" "+alcoholNames[11]);*/
							 
							 System.out.println("main Started");
						System.out.println("The alcohol names are :");
						
						for(String alcoholName : alcoholNames)
							System.out.println(alcoholName);
						
						
						System.out.println("main ended");
	}
}