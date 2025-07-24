class NewspaperRunner{
	
	public static void main(String args[]){
		System.out.println("main started");
		
		//ClassName refrence/variables=new ClassName()/constructor;
		NewsPaper ref1= new NewsPaper();
		ref1.newsPaperId=1;
		ref1.noOfPages=10;
		//ref1.language="Kannada";
		ref1.date="01/01/2025";
		ref1.day="Monday";
		ref1.companyName="Times of India";
		
		
		//ref1.newsPaperId =2; //--->Reinitialization
		System.out.println("The newsPaperId is :" + ref1.newsPaperId);
		ref1.newsPaperId =2;
		System.out.println("The newsPaperId is :" + ref1.newsPaperId);
		System.out.println("The noOfPages is :" + ref1.noOfPages);
		ref1.language = "English";
		System.out.println("The language is :" + ref1.language);
		System.out.println("The date is :" + ref1.date);
		System.out.println("The day is :" + ref1.day);
		System.out.println("The companyName is :" + ref1.companyName);
		
		
	}
}
