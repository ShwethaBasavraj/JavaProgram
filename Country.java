class Country{

	public static int getCountryCode(String countryName){
		int countryCode = 0;

	   if(countryName == "India"){
			countryCode = 91;
			} else if (countryName == "Australia"){
				countryCode = 61;
				return countryCode;
				
			} else if (countryName == "Sri Lanka"){
					countryCode=94;
				return countryCode;
					
					
			}else if( countryName == "Sudan"){
					countryCode = 249;
					return countryCode;
					
			}else if(countryName == "Russia"){
					countryCode = 7;
					return countryCode;
					
			}else if(countryName == "United s"){
					countryCode = 44;
					return countryCode;
			}else if(countryName == "Canada"){
					countryCode = 1;
			}else if(countryName == "Germany"){
					countryCode = 49;
			}else if(countryName == "France	"){
					countryCode = 33;
			}else if(countryName == "Italy"){
					countryCode = 39;
			}else if(countryName == "Brazil"){
					countryCode = 55;
			}else if(countryName == "China"){
					countryCode = 86;
			}else if(countryName == "Japan"){
					countryCode = 89;
			}else if(countryName == "South Korea"){
					countryCode = 82;
			}else if(countryName == "Singapore"){
					countryCode = 65;
			}else if(countryName == "Malaysia"){
					countryCode = 60;
			}else if(countryName == "Thailand"){
					countryCode = 66;
			}else if(countryName == "Indonesia"){
					countryCode = 62;
			}else if(countryName == "Bangladesh"){
					countryCode = 880;
			}else if(countryName == "Nepal"){
					countryCode = 977;
			}else if(countryName == "Turkey"){
					countryCode = 90;
			}              
			else if(countryName == "Iran"){
					countryCode = 98;
		   }else if(countryName == "Egypt"){
					countryCode = 20;
			}else if(countryName == "Nigeria"){
					countryCode = 234;
			}else if(countryName == "Kenya"){
					countryCode = 254;
			}else if(countryName == "Argentina"){
					countryCode = 54;
			}else if(countryName == "Chile"){
					countryCode = 56;
			}else if(countryName == "Mexico"){
					countryCode = 52;
			}else if(countryName == "Colombia"){
					countryCode = 57;
			}else if(countryName == "Venezuela"){
					countryCode = 58;
			}else if(countryName == "Spain"){
					countryCode = 34;
	        }else if(countryName == "Portugal"){
					countryCode = 351;
			}else if(countryName == "Greece"){
					countryCode = 30;
			}else if(countryName == "Poland"){
					countryCode = 48;
			}else if(countryName == "Netherlands"){
					countryCode = 31;
			}else if(countryName == "Sweden"){
					countryCode = 46;
			}else if(countryName == "Norway"){
					countryCode = 47;
			}else if(countryName == "Finland"){
					countryCode = 358;
			}else if(countryName == "Denmark"){
					countryCode = 45;
			}else if(countryName == "Switzerland"){
					countryCode = 41;
			}else if(countryName == "Austria"){
					countryCode = 43;
			}else if(countryName == "Belgium"){
					countryCode = 32;
			}else if(countryName == "Czech Republic"){
					countryCode = 420;
			}else if(countryName == "Hungary"){
					countryCode = 36;
}

	
		else{
		System.out.println(countryName + ": invalid");
	}
		
	return countryCode;
	}

}



/*class Country{

public static int getCountryCode(String countryName){
int countryCode = 0;

if(countryName == "India"){
countryCode=91;
}

else if(countryName == "Australia"){
countryCode=61;
}
else{
System.out.println(countryCode +"country code is not valid");
} 

return countryCode;
}
}
*/