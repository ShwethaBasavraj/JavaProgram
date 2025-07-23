class BankAccountRunner{
	
	
	static double balance = 200.00;
	
	
	public static void main(String acount[]){
	
		System.out.println("main started");
		
		
		boolean amountIsCredited = BankAccount.credit(2000);
		System.out.println("credited sucussful "+" "+amountIsCredited);
		System.out.println("The current balance is"+" "+BankAccount.getBalance());
		
		
		boolean amountIsDebited	 = BankAccount.debit(1000.00);
		System.out.println("The current balance is"+" "+amountIsDebited);
		System.out.println("The current balance is"+" "+BankAccount.getBalance());
		System.out.println("main ended");
	}
}
		
		/*System.out.println(balance);
		//methodName
		BankAccount.credit(10000.00);
		//BankAccountRunner.credit(10000.00);
		System.out.println("The current balance is"+" "+balance);

		//methosName
		BankAccount.debit(2000.00);	
		System.out.println("The current balance is"+" "+balance);
		System.out.println("main ended");*/
	
	
	
	
	
	//System.out.println(BankAccountRunner.getBalance);
		//methodNameptp
	/*public static void debit(double amount){s
	
		System.out.println("debit started");
			balance = balance-amount;
		System.out.println("debit ended");
	}
	
	public static void credit(double amount){
	
		System.out.println("credit started");
			balance = balance+amount; 
		System.out.println("debit ended");
	}*/
																																																				