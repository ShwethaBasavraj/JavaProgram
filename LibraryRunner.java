class LibraryRunner{
	public static void main(String lib[]){
		
		Book book = new Book();
		
		book.nameOfBook="Mahabharath";
		book.authorOfBook="Krishna Dvaipayana Vyasa";
		book.noOfPages=5800;
		book.language="Sanskrit";
		
		Shelf shelf = new Shelf("Sanskrit",100,2,"Mythology",book);
		
		Library library = new Library("HinduSagara","Nagarabhavi",100,"10:00Am to 10:00Pm",shelf);
	
		library.getLibraryInfo();
	}
}

