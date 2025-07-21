class SocialMedia{
	
	static String mediaName1 = "Insta";
	static String mediaName2 = "Watsapp";
	static String mediaName3 = "FaceBook";
	static String mediaName4 = "Twitter";
	static String mediaName5 = "Youtube";
	static String mediaName6 = "Google";
	static String mediaName7 = "Gmail";
	static String mediaName8 = "Remini";
	static String mediaName9 = "SnapChat";
	static String mediaName10 = "JioSavan";
	
		static String mediaNames[]={mediaName1,mediaName2,mediaName3,mediaName4,mediaName5,mediaName6,mediaName7,mediaName8,mediaName9,mediaName10};
		
		public static void main(String names[]){
		
		//System.out.println(mediaNames[0]+" "+mediaNames[1]+" "+mediaNames[2]+" "+mediaNames[3]+" "+mediaNames[4]+" "+mediaNames[5]+" "+mediaNames[6]+" "+mediaNames[7]+" "+mediaNames[8]+" "+mediaNames[9]);
		
		System.out.println("main Started");
						System.out.println("The SocialMedia are :");
						
								System.out.println(mediaName1);
								System.out.println(mediaName2);
								System.out.println(mediaName3);
								System.out.println(mediaName4);
								System.out.println(mediaName5);
								System.out.println(mediaName6);
								System.out.println(mediaName7);
								System.out.println(mediaName8);
								System.out.println(mediaName9);
								System.out.println(mediaName10);
								System.out.println();	
						
						for(String mediaName : mediaNames)
							System.out.println(mediaName);
						
						
						System.out.println("main ended");
	
	}
}