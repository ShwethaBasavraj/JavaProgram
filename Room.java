class Room{
	
String roomSize;
int roomNo;
String type;
boolean isBalconyAvailable;
String bedType;



public void getRoomDetails(){
	System.out.println("The room details are :");
	System.out.println("The room size is " + roomSize);
	System.out.println("RoomNumber :" + roomNo);
	System.out.println("RoomType :" + type);
	System.out.println("BalconyAvailable :" + isBalconyAvailable);
	System.out.println("BedType :" + bedType);
	System.out.println();
}

}