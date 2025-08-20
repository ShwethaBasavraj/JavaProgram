class Shelf {
	String shelfName;
	int noOfBooksItContains;
	int floorNO;
	String bookCategory;
	Book book;
	
	Shelf(){
		
	}
	Shelf(String shelfName,int noOfBooksItContains,int floorNO,String bookCategory,Book book){
		this.shelfName=shelfName;
		this.noOfBooksItContains=noOfBooksItContains;
		this.floorNO=floorNO;
		this.bookCategory=bookCategory;
		this.book=book;
	}
	
	public void getShelfInfo(){
		System.out.println("Shelf Information :");
		System.out.println();
		System.out.println("No Of Books it Contains :" + noOfBooksItContains);
		System.out.println("Floor-NO :" + floorNO);
		System.out.println("Book Category :" + bookCategory);
		System.out.println();
		
		this.book.getBookInfo();
		
	}
	
	
	
}