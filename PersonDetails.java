class PersonDetails{
	
	static String fullName;
	static int agee;
	static long phoneNumber;
	static short birthYear;
	static float height;
	static double weight;
	static char gender; 
	static boolean isMarried;
	
	public static boolean collectPersonDetails(String fName, int age, long pnNum, short brtYr, float hgt, double wgt, char gen, boolean married){
	
		//validation
		
		boolean isPersonDetailsCollected = false;
		boolean fNameValid = false;
		boolean ageVaild = false;
		boolean pnNumValid = false;
		boolean brtYrValid =false;
		boolean hgtValid = false;
		boolean wgtValid = false;
		boolean genValid = false;
		boolean isMarriedValid =false;
		
			if(fName != ""){
				fullName=fName;
				fNameValid=true;
			}
			
			if(age > 0){
				agee=age;
				ageVaild=true;
			}
			
			if(pnNum > 0){
				phoneNumber=pnNum;
				pnNumValid=true;
			}
			
			if(brtYr > 0){
				birthYear=brtYr;
				brtYrValid=true;
			}
			
			if(hgt > 0){
				height=hgt;
				hgtValid=true;
			}
			
			if(wgt > 0){
				weight=wgt;
				wgtValid=true;
			}
			
			if(gen == 'M' || gen == 'F'){
				gender=gen;
				genValid=true;
			}
		    
			if(married != false){
				isMarried=married;
				isMarriedValid=true;
			}
			
			 if (fNameValid && ageVaild && pnNumValid && brtYrValid && hgtValid &&
            wgtValid && genValid && isMarriedValid) {
            isPersonDetailsCollected = true;
        }

        return isPersonDetailsCollected;
    }
	
	 public static void getPersonInfo() {
        System.out.println("----- Person Information -----");
        System.out.println("Name        : " + fullName);
        System.out.println("Age         : " + agee);
        System.out.println("Birth Year  : " + birthYear);
        System.out.println("Gender      : " + gender);
        System.out.println("Phone No.   : " + phoneNumber);
        System.out.println("Height      : " + height+" "+"cm");
        System.out.println("Weight      : " + weight+" "+"kg");
        System.out.println("Married     : " + isMarried);
        System.out.println("------------------------------");


	}
}

		