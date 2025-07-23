class Library{

		static String bookNames[]={"Mallegalalli Madumagalu","Mookajjia Kanasugalu","Chidambara Rahasya","Huliya Neralu","Aval Hede","Samsara","Adavanta","Agni"};
		
		public static void main(String names[]){
		
		//System.out.println(bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);
	
		System.out.println("main Started");
						System.out.println("The bookNames are :");
						
						for(String bookName : bookNames)
							System.out.println(bookName);
						
						
						System.out.println("main ended");
	}
}