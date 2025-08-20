class Book{
	String nameOfBook;
	String authorOfBook;
	int noOfPages;
	String language;
	
	public void getBookInfo(){
		System.out.println("Book Information :");
		System.out.println();
		System.out.println("Book Name :" + nameOfBook);
		System.out.println("Author Name :" + authorOfBook);
		System.out.println("No of pages :" + noOfPages);
		System.out.println("Book language :" + language);
		System.out.println();
	}
}