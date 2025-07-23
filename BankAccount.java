class BankAccount{
	
	static double balance = 10000.00 ;
	
	public static double getBalance(){
		return balance;
	}
	
/*	public static double credit(double amount){
	
		System.out.println("credit started");
				boolean check = amount>0.00;
					if(check){			
			BankAccount.balance = BankAccount.balance +amount;
				}
					else{
		System.out.println("credit the suffecient amount");			
				}
		System.out.println("credit ended");
		return BankAccount.balance;
	}*/
	
	public static boolean credit(double amount){
	System.out.println("credit started");
	
	boolean isCredited = false;
	
	boolean value = amount > 0.00;
		if(value){
		balance = balance + amount;
		isCredited = true;
			}	
			else{
		System.out.println("credit the suffecient amount");
		}
		System.out.println("credit ended");
		return isCredited;
}
	
	
	public static boolean debit(double amount){
		System.out.println("debit started");
		
			boolean isDebited = false;
			
			boolean amountCheck = amount <= 800.00;
					if(amountCheck){
				balance = balance -amount;
				isDebited = true;
					}
					else{
		System.out.println("No funds available");
					}		
					
		System.out.println("debit ended");
		return isDebited ;
	}
	



}