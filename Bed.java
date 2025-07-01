class Bed{
	
	static String Brand = "Amazon Brand - Solimo";
	static double Price = 15999;
	static String color = "Teak";
	static String productDimension = "2.06L x 1.6W x 0.89H Meters";
	static String finishType = "lacqured";
	static String weightLimit = "350 Kilograms";
	static String itemWeight = " 65000Grams";
	
	public static void main(String bed[]){
	
	System.out.println("main started");
	
	//String Brand = "Amazon Brand - Solimo";
	//double Price = 15999;
	//String color = "Teak";
	//String productDimension = "2.06L x 1.6W x 0.89H Meters";
	//String finishType = "lacqured";
	//String weightLimit = "350 Kilograms";
	//String itemWeight = " 65000Grams";
	
	String A = "The brand name is :";
	String B = "The Price of the bed is :";
	String C = "The color of the bed is :";
	String D = "The productDimension of the bed is :";
	String E = "The finishType of the bed is :";
	String F = "weightLimit of the bed is :";
	String G = "itemWeight:";

	
	System.out.println(A+Brand);
	System.out.println(B+Price);
	System.out.println(C+color);
	System.out.println(D+productDimension);
	System.out.println(E+finishType);
	System.out.println(F+weightLimit);
	System.out.println(G+itemWeight);
	
	
	System.out.println("main ended");
	}
}