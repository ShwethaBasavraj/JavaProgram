class BillRunner{
	public static void main(String[] args){
		System.out.println("main started");
		
		Bill.planType = "Quaterly Plan";
		Bill.isBillPaid = false;
		Bill.billAmountWithTax = 710.00;
		
		System.out.println("The Bill amount is "+ Bill.billAmountWithTax );
		System.out.println("main ended");
		
	}
}