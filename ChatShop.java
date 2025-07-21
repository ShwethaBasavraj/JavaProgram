class ChatShop{
	
	static String chat1 = "Panipuri";
	static String chat2 = "Sevpuri";
	static String chat3 = "Bhel";
	static String chat4 = "daipuri";
	static String chat5 = "Samosa";
	static String chat6 = "Vadpav";
	static String chat7 = "Kachori";
	static String chat8 = "Gobi";
	static String chat9 = "NipattMasala";
	static String chat10 = "Masalapuri";
		
		static String chats[]={chat1,chat2,chat3,chat4,chat5,chat6,chat7,chat8,chat9,chat10};
		
		public static void main(String names[]){
		
		//System.out.println(chats[0]+" "+chats[1]+" "+chats[2]+" "+chats[3]+" "+chats[4]+" "+chats[5]+" "+chats[6]+" "+chats[7]+" "+chats[8]+" "+chats[9]);
		
		System.out.println("main Started");
						System.out.println("The chats are :");
						
								System.out.println(chat1);
								System.out.println(chat2);
								System.out.println(chat3);
								System.out.println(chat4);
								System.out.println(chat5);
								System.out.println(chat6);
								System.out.println(chat7);
								System.out.println(chat8);
								System.out.println(chat9);
								System.out.println(chat10);
								System.out.println();					
						
						for(String chat : chats)
							System.out.println(chat);
						
						
						System.out.println("main ended");
	
	}
}