class Wire{
	int wireId;
	String wireBrand;
	String color;
	int lengthInMts;
	double price;
	
	Wire(){
	}
	
	
	//1st
	Wire(int wireId,String wireBrand,String color,int lengthInMts,double price){
	
		this.wireId = wireId;
		this.wireBrand = wireBrand;
		this.color = color;
		this.lengthInMts = lengthInMts;
		this.price = price;
	}
	
	//2nd
	Wire(int wireId,){

		this.wireBrand = wireBrand;
		
	}
	
	//3rd
	Wire(String wireBrand){

		this.wireBrand = wireBrand;
		
	}
	
	//4th
	Wire(String color){

		this.color = color;
		
	}
	
	//5th
	Wire(int lengthInMts){

		this.lengthInMts = lengthInMts;
	}
	
	//6th
	Wire(double price){
	
		this.price = price;
	}
	
	//7th
	Wire(int wireId,int lengthInMts){
	
		this.wireId = wireId;
		this.lengthInMts = lengthInMts;
	}
	
	//8th
	Wire(String wireBrand,String color){

		this.wireBrand = wireBrand;
		this.color = color;
		
	}
	
	//9th
	Wire(int wireId,String wireBrand){
	
		this.wireId = wireId;
		this.wireBrand = wireBrand;
	}
	
	//10th
	Wire(String wireBrand,int lengthInMts){

		this.wireBrand = wireBrand;
		this.lengthInMts = lengthInMts;
	}
	
	//11th
	Wire(String wireBrand,int lengthInMts,double price){
	
		
		this.wireBrand = wireBrand;
		this.lengthInMts = lengthInMts;
		this.price = price;
	}
	
	
}







