class Floor{
	int noOfFloor;
	String nameOfFloor;
	Room room = new Room();
	
	
	Floor(){
			
		}
		
		Floor(int noOfFloor,String nameOfFloor,Room room){
		this.noOfFloor = noOfFloor;
		this.nameOfFloor = nameOfFloor;
		this.room = room;
		}
		

	public void getFloorInfo(){
		System.out.println("The floor details are :");
		System.out.println("The no of floors" + noOfFloor);
		System.out.println("The name of the floor :" + nameOfFloor);
		System.out.println();
		
		this.room.getRoomDetails();
	}
}