class HotelRunner{
	public static void main(String [] taj){
	Room room = new Room();
	
	room.roomSize = "48 m?/517 ft";
	room.roomNo = 104;
	room.type = "AC";
	room.isBalconyAvailable = true;
	room.bedType = "QueenBed";
	
	
	
	Floor floor = new Floor(20,"Malgudi",room);
	
	Hotel hotel = new Hotel();
	
	hotel.hotelName = "TajHotel";
	hotel.ownerName = "MR Dev";
	hotel.noOfWorkers = 120;
	System.out.println(hotel.floor);
	//System.out.println(hotel.floor.room);---java.lang.NullPointerException
	hotel.floor = floor;
	
	// has a relationship
	//String hotelName = "TajHotel";
	//hotel.hotelName = hotelName;
	
	
	
	//Floor floor = new Floor(20,"Malgudi");
	//hotel.floor = floor;
	//floor.noOfFloor = 20;
	//floor.nameOfFloor = "Malgudi";
	

	
	
	hotel.getHotelInfo();
	
	
	}
}





