class Earbuds{
	
	static String Brand = "OnePlus";
	static double Price = 2999;
	static String color = "Harmonic Gray";
	static String earPlacement = "In Ear";
	static String formFactor = "In Ear";
	static String impedance = "8 Ohm";
	static String warranty = " 1 year"; 
	
	public static void main(String earbuds[]){
	
	System.out.println("main started");
	
	//String Brand = "OnePlus";
	//double Price = 2999;
	//String color = "Harmonic Gray";
	//String earPlacement = "In Ear";
	//String formFactor = "In Ear";
	//String impedance = "8 Ohm";
	//String warranty = " 1 year";
	
	String A = "The brand name is :";
	String B = "The Price of the earbuds is :";
	String C = "The color of the earbuds is :";
	String D = "The earPlacement of the earbuds is :";
	String E = "The formFactor of the earbuds is :";
	String F = "impedance of the earbuds is :";
	String G = "Warranty :";

	
	System.out.println(A+Brand);
	System.out.println(B+Price);
	System.out.println(C+color);
	System.out.println(D+earPlacement);
	System.out.println(E+formFactor);
	System.out.println(F+impedance);
	System.out.println(G+warranty);
	
	
	System.out.println("main ended");
	}
}