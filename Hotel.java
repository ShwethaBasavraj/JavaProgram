class Hotel {
	
String hotelName;
String ownerName;
int noOfWorkers;

Floor floor = new Floor();

		Hotel(){
			
		}
		
		Hotel(String hotelName,String ownerName,int noOfWorkers,Floor floor){
		this.hotelName = hotelName;
		this.ownerName = ownerName;
		this.noOfWorkers = noOfWorkers;
		this.floor = floor;
		}
		
		public void getHotelInfo(){
			System.out.println("The hotel info has been featched");
		
			System.out.println("HotelName :" + hotelName);
			System.out.println("OwnerName :" + ownerName);
			System.out.println("No of workers :" + noOfWorkers);
			System.out.println();
			
			this.floor.getFloorInfo();
		}
		
		
}