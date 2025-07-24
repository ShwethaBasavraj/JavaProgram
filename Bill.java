class Bill{
	
	
// properties or references or states or data members
	int billId;
	String planType;
	double billAmountWithTax;
	String billIssueDate;
	String paymentMenthod;
	String billDueDate;
	boolean isTaxInclusive;
	boolean isBillPaid;
	boolean isBillOverDue;
	
	public static void main(String bill[]){
	
	// 1st Bill....
	Bill firstBill = new Bill();
	
	firstBill.billId = 1;
	firstBill.planType = "Monthly";
	firstBill.billAmountWithTax = 240.4;
	firstBill.billIssueDate = "20/04/2024";
	firstBill.paymentMenthod = "G pay";
	firstBill.billDueDate = "20/05/2024";
	firstBill.isTaxInclusive = true;
	firstBill.isBillPaid = true;
	firstBill.isBillOverDue = false;
	
	System.out.println("First Bill....   ");
	System.out.println();
	System.out.println("The first bill Id is :" + firstBill.billId);
	System.out.println("The plan type is :" + firstBill.planType);
	System.out.println("The bill AmountWithTax is :" + firstBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + firstBill.billIssueDate);
	System.out.println("The payment menthod is :" + firstBill.paymentMenthod);
	System.out.println("The billDueDate is :" + firstBill.billDueDate);
	System.out.println("isTaxInclusive :" + firstBill.isTaxInclusive);
	System.out.println("isBillPaid :" + firstBill.isBillPaid);
	System.out.println("isBillOverDue :" + firstBill.isBillOverDue);
	System.out.println();
	
	//2nd Bill....
	Bill secondBill = new Bill();
	
	secondBill.billId = 2;
	secondBill.planType = "2 Months";
	secondBill.billAmountWithTax = 380.24;
	secondBill.billIssueDate = "04/05/2025";
	secondBill.paymentMenthod = "phonePay";
	secondBill.billDueDate = "04/07/2025";
	secondBill.isTaxInclusive = true;
	secondBill.isBillPaid = true;
	secondBill.isBillOverDue = false;
	
	System.out.println("Second Bill....   ");
	System.out.println();
	System.out.println("The second bill Id is :" + secondBill.billId);
	System.out.println("The plan type is :" + secondBill.planType);
	System.out.println("The bill AmountWithTax is :" + secondBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + secondBill.billIssueDate);
	System.out.println("The payment menthod is :" + secondBill.paymentMenthod);
	System.out.println("The billDueDate is :" + secondBill.billDueDate);
	System.out.println("isTaxInclusive :" + secondBill.isTaxInclusive);
	System.out.println("isBillPaid :" + secondBill.isBillPaid);
	System.out.println("isBillOverDue :" + secondBill.isBillOverDue);
	System.out.println();
	
	//3rd Bill....
	Bill thirdBill	= new Bill();
	
	thirdBill.billId = 3;
	thirdBill.planType = "3 Months";
	thirdBill.billAmountWithTax = 580.24;
	thirdBill.billIssueDate = "04/04/2022";
	thirdBill.paymentMenthod = "G pay";
	thirdBill.billDueDate = "04/07/2022";
	thirdBill.isTaxInclusive = true;
	thirdBill.isBillPaid = true;
	thirdBill.isBillOverDue = false;
	
	System.out.println("Third Bill....   ");
	System.out.println();
	System.out.println("The third bill Id is :" + thirdBill.billId);
	System.out.println("The plan type is :" + thirdBill.planType);
	System.out.println("The bill AmountWithTax is :" + thirdBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + thirdBill.billIssueDate);
	System.out.println("The payment menthod is :" + thirdBill.paymentMenthod);
	System.out.println("The billDueDate is :" + thirdBill.billDueDate);
	System.out.println("isTaxInclusive :" + thirdBill.isTaxInclusive);
	System.out.println("isBillPaid :" + thirdBill.isBillPaid);
	System.out.println("isBillOverDue :" + thirdBill.isBillOverDue);
	System.out.println();
	
	//4th Bill....
	Bill fourthBill = new Bill();
	
	fourthBill.billId = 4;
	fourthBill.planType = "4 Months";
	fourthBill.billAmountWithTax = 680.24;
	fourthBill.billIssueDate = "04/04/2022";
	fourthBill.paymentMenthod = "G pay";
	fourthBill.billDueDate = "04/06/2022";
	fourthBill.isTaxInclusive = true;
	fourthBill.isBillPaid = true;
	fourthBill.isBillOverDue = false;
	
	System.out.println("Fourth Bill....   ");
	System.out.println();
	System.out.println("The third bill Id is :" + fourthBill.billId);
	System.out.println("The plan type is :" + fourthBill.planType);
	System.out.println("The bill AmountWithTax is :" + fourthBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + fourthBill.billIssueDate);
	System.out.println("The payment menthod is :" + fourthBill.paymentMenthod);
	System.out.println("The billDueDate is :" + fourthBill.billDueDate);
	System.out.println("isTaxInclusive :" + fourthBill.isTaxInclusive);
	System.out.println("isBillPaid :" + fourthBill.isBillPaid);
	System.out.println("isBillOverDue :" + fourthBill.isBillOverDue);
	System.out.println();
	
	//5th Bill
	Bill fifthBill = new Bill();
	
	fifthBill.billId = 5;
	fifthBill.planType = "5 Months";
	fifthBill.billAmountWithTax = 780.24;
	fifthBill.billIssueDate = "04/11/2023";
	fifthBill.paymentMenthod = "G pay";
	fifthBill.billDueDate = "04/03/2024";
	fifthBill.isTaxInclusive = true;
	fifthBill.isBillPaid = true;
	fifthBill.isBillOverDue = false;
	
	System.out.println("Fifth Bill....   ");
	System.out.println();
	System.out.println("The fifth bill Id is :" + fifthBill.billId);
	System.out.println("The plan type is :" + fifthBill.planType);
	System.out.println("The bill AmountWithTax is :" + fifthBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + fifthBill.billIssueDate);
	System.out.println("The payment menthod is :" + fifthBill.paymentMenthod);
	System.out.println("The billDueDate is :" + fifthBill.billDueDate);
	System.out.println("isTaxInclusive :" + fifthBill.isTaxInclusive);
	System.out.println("isBillPaid :" + fifthBill.isBillPaid);
	System.out.println("isBillOverDue :" + fifthBill.isBillOverDue);
	System.out.println();
	
	//6th Bill
	Bill sixthBill = new Bill();
	
	sixthBill.billId = 6;
	sixthBill.planType = "6 Months";
	sixthBill.billAmountWithTax = 880.24;
	sixthBill.billIssueDate = "04/1/2023";
	sixthBill.paymentMenthod = "G pay";
	sixthBill.billDueDate = "04/06/2023";
	sixthBill.isTaxInclusive = true;
	sixthBill.isBillPaid = true;
	sixthBill.isBillOverDue = false;
	
	System.out.println("Sixth Bill....   ");
	System.out.println();
	System.out.println("The sixth bill Id is :" + sixthBill.billId);
	System.out.println("The plan type is :" + sixthBill.planType);
	System.out.println("The bill AmountWithTax is :" + sixthBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + sixthBill.billIssueDate);
	System.out.println("The payment menthod is :" + sixthBill.paymentMenthod);
	System.out.println("The billDueDate is :" + sixthBill.billDueDate);
	System.out.println("isTaxInclusive :" + sixthBill.isTaxInclusive);
	System.out.println("isBillPaid :" + sixthBill.isBillPaid);
	System.out.println("isBillOverDue :" + sixthBill.isBillOverDue);
	System.out.println();
	
	//7th Bill
	Bill seventhBill = new Bill();
	
	seventhBill.billId = 7;
	seventhBill.planType = "7 Months";
	seventhBill.billAmountWithTax = 1200.00;
	seventhBill.billIssueDate = "04/6/2023";
	seventhBill.paymentMenthod = "G pay";
	seventhBill.billDueDate = "04/12/2023";
	seventhBill.isTaxInclusive = true;
	seventhBill.isBillPaid = true;
	seventhBill.isBillOverDue = false;
	
	System.out.println("Seventh Bill....   ");
	System.out.println();
	System.out.println("The seventh bill Id is :" + seventhBill.billId);
	System.out.println("The plan type is :" + seventhBill.planType);
	System.out.println("The bill AmountWithTax is :" + seventhBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + seventhBill.billIssueDate);
	System.out.println("The payment menthod is :" + seventhBill.paymentMenthod);
	System.out.println("The billDueDate is :" + seventhBill.billDueDate);
	System.out.println("isTaxInclusive :" + seventhBill.isTaxInclusive);
	System.out.println("isBillPaid :" + seventhBill.isBillPaid);
	System.out.println("isBillOverDue :" + seventhBill.isBillOverDue);
	System.out.println();
	
	//8th Bill
	Bill eighthBill = new Bill();
	
	eighthBill.billId = 8;
	eighthBill.planType = "8 Months";
	eighthBill.billAmountWithTax = 1400.00;
	eighthBill.billIssueDate = "06/6/2024";
	eighthBill.paymentMenthod = "G pay";
	eighthBill.billDueDate = "04/12/2024";
	eighthBill.isTaxInclusive = true;
	eighthBill.isBillPaid = true;
	eighthBill.isBillOverDue = false;
	
	System.out.println("Eigth Bill....   ");
	System.out.println();
	System.out.println("The eight bill Id is :" + eighthBill.billId);
	System.out.println("The plan type is :" + eighthBill.planType);
	System.out.println("The bill AmountWithTax is :" + eighthBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + eighthBill.billIssueDate);
	System.out.println("The payment menthod is :" + eighthBill.paymentMenthod);
	System.out.println("The billDueDate is :" + eighthBill.billDueDate);
	System.out.println("isTaxInclusive :" + eighthBill.isTaxInclusive);
	System.out.println("isBillPaid :" + eighthBill.isBillPaid);
	System.out.println("isBillOverDue :" + eighthBill.isBillOverDue);
	System.out.println();
	
	//9th Bill
	Bill ninethBill = new Bill();
	
	ninethBill.billId = 9;
	ninethBill.planType = "9 Months";
	ninethBill.billAmountWithTax = 1600.00;
	ninethBill.billIssueDate = "04/02/2023";
	ninethBill.paymentMenthod = "G pay";
	ninethBill.billDueDate = "04/08/2023";
	ninethBill.isTaxInclusive = true;
	ninethBill.isBillPaid = true;
	ninethBill.isBillOverDue = false;
	
	System.out.println("Nineth Bill....   ");
	System.out.println();
	System.out.println("The nineth bill Id is :" + ninethBill.billId);
	System.out.println("The plan type is :" + ninethBill.planType);
	System.out.println("The bill AmountWithTax is :" + ninethBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ninethBill.billIssueDate);
	System.out.println("The payment menthod is :" + ninethBill.paymentMenthod);
	System.out.println("The billDueDate is :" + ninethBill.billDueDate);
	System.out.println("isTaxInclusive :" + ninethBill.isTaxInclusive);
	System.out.println("isBillPaid :" + ninethBill.isBillPaid);
	System.out.println("isBillOverDue :" + ninethBill.isBillOverDue);
	System.out.println();
	
	//10th Bill
	Bill TenthBill = new Bill();
	
	TenthBill.billId = 10;
	TenthBill.planType = "10 Months";
	TenthBill.billAmountWithTax = 1800.00;
	TenthBill.billIssueDate = "01/08/2023";
	TenthBill.paymentMenthod = "G pay";
	TenthBill.billDueDate = "01/12/2023";
	TenthBill.isTaxInclusive = true;
	TenthBill.isBillPaid = true;
	TenthBill.isBillOverDue = false;
	
	System.out.println("Tenth Bill....   ");
	System.out.println();
	System.out.println("The tenth bill Id is :" + TenthBill.billId);
	System.out.println("The plan type is :" + TenthBill.planType);
	System.out.println("The bill AmountWithTax is :" + TenthBill.billAmountWithTax);
	System.out.println("The billIssueDate is :" + TenthBill.billIssueDate);
	System.out.println("The payment menthod is :" + TenthBill.paymentMenthod);
	System.out.println("The billDueDate is :" + TenthBill.billDueDate);
	System.out.println("isTaxInclusive :" + TenthBill.isTaxInclusive);
	System.out.println("isBillPaid :" + TenthBill.isBillPaid);
	System.out.println("isBillOverDue :" + TenthBill.isBillOverDue);
	System.out.println();
	
	//11th Bill
	Bill ref1 = new Bill();
	
	ref1.billId = 11;
	ref1.planType = "11 Months";
	ref1.billAmountWithTax = 2000.00;
	ref1.billIssueDate = "0/6/2023";
	ref1.paymentMenthod = "G pay";
	ref1.billDueDate = "04/12/2023";
	ref1.isTaxInclusive = true;
	ref1.isBillPaid = true;
	ref1.isBillOverDue = false;
	
	System.out.println("11th  Bill....   ");
	System.out.println();
	System.out.println("The eight bill Id is :" + ref1.billId);
	System.out.println("The plan type is :" + ref1.planType);
	System.out.println("The bill AmountWithTax is :" + ref1.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref1.billIssueDate);
	System.out.println("The payment menthod is :" + ref1.paymentMenthod);
	System.out.println("The billDueDate is :" + ref1.billDueDate);
	System.out.println("isTaxInclusive :" + ref1.isTaxInclusive);
	System.out.println("isBillPaid :" + ref1.isBillPaid);
	System.out.println("isBillOverDue :" + ref1.isBillOverDue);
	System.out.println();
	
	//12th Bill
	Bill ref2 = new Bill();
	
	ref2.billId = 12;
	ref2.planType = "12 Months";
	ref2.billAmountWithTax = 3000.00;
	ref2.billIssueDate = "07/6/2023";
	ref2.paymentMenthod = "G pay";
	ref2.billDueDate = "07/01/2024";
	ref2.isTaxInclusive = true;
	ref2.isBillPaid = true;
	ref2.isBillOverDue = false;
	
	System.out.println("12th  Bill....   ");
	System.out.println();
	System.out.println("The eight bill Id is :" + ref2.billId);
	System.out.println("The plan type is :" + ref2.planType);
	System.out.println("The bill AmountWithTax is :" + ref2.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref2.billIssueDate);
	System.out.println("The payment menthod is :" + ref2.paymentMenthod);
	System.out.println("The billDueDate is :" + ref2.billDueDate);
	System.out.println("isTaxInclusive :" + ref2.isTaxInclusive);
	System.out.println("isBillPaid :" + ref2.isBillPaid);
	System.out.println("isBillOverDue :" + ref2.isBillOverDue);
	System.out.println();
	
	//13th Bill
	Bill ref3 = new Bill();
	
	ref3.billId = 13;
	ref3.planType = "13 Months";
	ref3.billAmountWithTax = 4000.00;
	ref3.billIssueDate = "17/6/2023";
	ref3.paymentMenthod = "G pay";
	ref3.billDueDate = "16/12/2023";
	ref3.isTaxInclusive = true;
	ref3.isBillPaid = true;
	ref3.isBillOverDue = false;
	
	System.out.println("13th  Bill....   ");
	System.out.println();
	System.out.println("The eight bill Id is :" + ref3.billId);
	System.out.println("The plan type is :" + ref3.planType);
	System.out.println("The bill AmountWithTax is :" + ref3.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref3.billIssueDate);
	System.out.println("The payment menthod is :" + ref3.paymentMenthod);
	System.out.println("The billDueDate is :" + ref3.billDueDate);
	System.out.println("isTaxInclusive :" + ref3.isTaxInclusive);
	System.out.println("isBillPaid :" + ref3.isBillPaid);
	System.out.println("isBillOverDue :" + ref3.isBillOverDue);
	System.out.println();
	
	//14th Bill
	Bill ref4 = new Bill();
	
	ref4.billId = 14;
	ref4.planType = "14 Months";
	ref4.billAmountWithTax = 5000.00;
	ref4.billIssueDate = "09/11/2023";
	ref4.paymentMenthod = "G pay";
	ref4.billDueDate = "04/04/2025";
	ref4.isTaxInclusive = true;
	ref4.isBillPaid = true;
	ref4.isBillOverDue = false;
	
	System.out.println("14th  Bill....   ");
	System.out.println();
	System.out.println("The fourteenth bill Id is :" + ref4.billId);
	System.out.println("The plan type is :" + ref4.planType);
	System.out.println("The bill AmountWithTax is :" + ref4.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref4.billIssueDate);
	System.out.println("The payment menthod is :" + ref4.paymentMenthod);
	System.out.println("The billDueDate is :" + ref4.billDueDate);
	System.out.println("isTaxInclusive :" + ref4.isTaxInclusive);
	System.out.println("isBillPaid :" + ref4.isBillPaid);
	System.out.println("isBillOverDue :" + ref4.isBillOverDue);
	System.out.println();
	
	//15th Bill
	Bill ref5 = new Bill();
	
	ref5.billId = 15;
	ref5.planType = "15 Months";
	ref5.billAmountWithTax = 6000.00;
	ref5.billIssueDate = "12/6/2024";
	ref5.paymentMenthod = "G pay";
	ref5.billDueDate = "12/12/2024";
	ref5.isTaxInclusive = true;
	ref5.isBillPaid = true;
	ref5.isBillOverDue = false;
	
	System.out.println("15th  Bill....   ");
	System.out.println();
	System.out.println("The fifteenth bill Id is :" + ref5.billId);
	System.out.println("The plan type is :" + ref5.planType);
	System.out.println("The bill AmountWithTax is :" + ref5.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref5.billIssueDate);
	System.out.println("The payment menthod is :" + ref5.paymentMenthod);
	System.out.println("The billDueDate is :" + ref5.billDueDate);
	System.out.println("isTaxInclusive :" + ref5.isTaxInclusive);
	System.out.println("isBillPaid :" + ref5.isBillPaid);
	System.out.println("isBillOverDue :" + ref5.isBillOverDue);
	System.out.println();
	
	//16th Bill
	Bill ref6 = new Bill();
	
	ref6.billId = 16;
	ref6.planType = "16 Months";
	ref6.billAmountWithTax = 7000.00;
	ref6.billIssueDate = "23/12/2023";
	ref6.paymentMenthod = "G pay";
	ref6.billDueDate = "23/12/2024";
	ref6.isTaxInclusive = true;
	ref6.isBillPaid = true;
	ref6.isBillOverDue = false;
	
	System.out.println("16th  Bill....   ");
	System.out.println();
	System.out.println("The sixteenth bill Id is :" + ref6.billId);
	System.out.println("The plan type is :" + ref6.planType);
	System.out.println("The bill AmountWithTax is :" + ref6.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref6.billIssueDate);
	System.out.println("The payment menthod is :" + ref6.paymentMenthod);
	System.out.println("The billDueDate is :" + ref6.billDueDate);
	System.out.println("isTaxInclusive :" + ref6.isTaxInclusive);
	System.out.println("isBillPaid :" + ref6.isBillPaid);
	System.out.println("isBillOverDue :" + ref6.isBillOverDue);
	System.out.println();
	
	//17th Bill
	Bill ref7 = new Bill();
	
	ref7.billId = 17;
	ref7.planType = "17 Months";
	ref7.billAmountWithTax = 8000.00;
	ref7.billIssueDate = "06/6/2024";
	ref7.paymentMenthod = "G pay";
	ref7.billDueDate = "04/04/202";
	ref7.isTaxInclusive = true;
	ref7.isBillPaid = true;
	ref7.isBillOverDue = false;
	
	System.out.println("17th  Bill....   ");
	System.out.println();
	System.out.println("The seventeenth bill Id is :" + ref7.billId);
	System.out.println("The plan type is :" + ref7.planType);
	System.out.println("The bill AmountWithTax is :" + ref7.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref7.billIssueDate);
	System.out.println("The payment menthod is :" + ref7.paymentMenthod);
	System.out.println("The billDueDate is :" + ref7.billDueDate);
	System.out.println("isTaxInclusive :" + ref7.isTaxInclusive);
	System.out.println("isBillPaid :" + ref7.isBillPaid);
	System.out.println("isBillOverDue :" + ref7.isBillOverDue);
	System.out.println();
	
	
	//18th Bill
	Bill ref8 = new Bill();
	
	ref8.billId = 18;
	ref8.planType = "18 Months";
	ref8.billAmountWithTax = 9000.00;
	ref8.billIssueDate = "02/12/2023";
	ref8.paymentMenthod = "G pay";
	ref8.billDueDate = "02/12/2024";
	ref8.isTaxInclusive = true;
	ref8.isBillPaid = true;
	ref8.isBillOverDue = false;
	
	System.out.println("18th  Bill....   ");
	System.out.println();
	System.out.println("The eighteenth bill Id is :" + ref8.billId);
	System.out.println("The plan type is :" + ref8.planType);
	System.out.println("The bill AmountWithTax is :" + ref8.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref8.billIssueDate);
	System.out.println("The payment menthod is :" + ref8.paymentMenthod);
	System.out.println("The billDueDate is :" + ref8.billDueDate);
	System.out.println("isTaxInclusive :" + ref8.isTaxInclusive);
	System.out.println("isBillPaid :" + ref8.isBillPaid);
	System.out.println("isBillOverDue :" + ref8.isBillOverDue);
	System.out.println();
	
	//19th Bill
	Bill ref9 = new Bill();
	
	ref9.billId = 19;
	ref9.planType = "19 Months";
	ref9.billAmountWithTax = 10000.00;
	ref9.billIssueDate = "01/01/2023";
	ref9.paymentMenthod = "G pay";
	ref9.billDueDate = "01/01/2024";
	ref9.isTaxInclusive = true;
	ref9.isBillPaid = true;
	ref9.isBillOverDue = false;
	
	System.out.println("19th  Bill....   ");
	System.out.println();
	System.out.println("The nineteenth bill Id is :" + ref9.billId);
	System.out.println("The plan type is :" + ref9.planType);
	System.out.println("The bill AmountWithTax is :" + ref9.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref9.billIssueDate);
	System.out.println("The payment menthod is :" + ref9.paymentMenthod);
	System.out.println("The billDueDate is :" + ref9.billDueDate);
	System.out.println("isTaxInclusive :" + ref9.isTaxInclusive);
	System.out.println("isBillPaid :" + ref9.isBillPaid);
	System.out.println("isBillOverDue :" + ref9.isBillOverDue);
	System.out.println();
	
	//20th Bill
	Bill ref10 = new Bill();
	
	
	ref10.billId = 20;
	ref10.planType = "20 Months";
	ref10.billAmountWithTax = 11000.00;
	ref10.billIssueDate = "01/01/2023";
	ref10.paymentMenthod = "G pay";
	ref10.billDueDate = "01/01/2024";
	ref10.isTaxInclusive = true;
	ref10.isBillPaid = true;
	ref10.isBillOverDue = false;
	
	System.out.println("20th  Bill....   ");
	System.out.println();
	System.out.println("The twentyth bill Id is :" + ref10.billId);
	System.out.println("The plan type is :" + ref10.planType);
	System.out.println("The bill AmountWithTax is :" + ref10.billAmountWithTax);
	System.out.println("The billIssueDate is :" + ref10.billIssueDate);
	System.out.println("The payment menthod is :" + ref10.paymentMenthod);
	System.out.println("The billDueDate is :" + ref10.billDueDate);
	System.out.println("isTaxInclusive :" + ref10.isTaxInclusive);
	System.out.println("isBillPaid :" + ref10.isBillPaid);
	System.out.println("isBillOverDue :" + ref10.isBillOverDue);
	System.out.println();
	}
}