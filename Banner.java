class Banner{
	
	static String bannerTitle;
	static String textColor;
	static String startDate;
	static boolean isVisible;
	static String bannerImageUrl;
	
	public static boolean bannerDetailsCollecting(String title,String color,String date,String image,boolean visible){
	
		boolean isbannerDetailsCollected = false;
		boolean titleValid = false;
		boolean colorValid = false;
		boolean dateValid = false;
		boolean imageValid = false;
		boolean visibleValid = false;
		
		
	if(title != null){
		bannerTitle = title;
		titleValid = true;
	}else{
		System.out.println("Please enter the banner name");
	}
	
	
	if(color != null){
		textColor = color;
		colorValid = true;
	}else{
		System.out.println("Please enter the color name");
	}
	
	if(date != null){
		startDate = date;
		dateValid = true;
	}else{
		System.out.println("Please enter the starting date");
	}
	
	if(image != null){
		bannerImageUrl = image;
		imageValid = true;
	}else{
		System.out.println("Pleaase insert the image");
	}
	
	isVisible = visible;
        visibleValid = true;
	
	if(titleValid ==  true && colorValid == true && dateValid == true && imageValid == true && visibleValid == true){
		isbannerDetailsCollected = true;
	}
	return  isbannerDetailsCollected;
	}
	
	public static void getBannerinfo(){
		
		System.out.println("Banner Title  : " + bannerTitle);
        System.out.println("Text Color : " +textColor);
        System.out.println("Starting Date : " +startDate);
        System.out.println("Banner Image : " +bannerImageUrl);
        System.out.println("In Banner details are visible : " +isVisible );		
        
    
	}
}