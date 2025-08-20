class Library {
	String libraryName;
	String location;
	int noOfWorkers;
	String timing;
	Shelf shelf;
	
	Library(){
		
	}
	Library(String libraryName,String location,int noOfWorkers,String timing,Shelf shelf){
		this.libraryName=libraryName;
		this.location=location;
		this.noOfWorkers=noOfWorkers;
		this.timing=timing;
		this.shelf=shelf;
	}
	public void getLibraryInfo(){
		System.out.println("Library Information :");
		System.out.println();
		System.out.println("Library Name :" + libraryName);
		System.out.println("Library Area :" + location);
		System.out.println("No of workers in library :" + noOfWorkers);
		System.out.println("Library timings :" + timing);
		System.out.println();
		
		this.shelf.getShelfInfo();
		
		
	}
	
}