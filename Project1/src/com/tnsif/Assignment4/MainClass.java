package com.tnsif.Assignment4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard credit = new CreditCard("Rash","1234 5678 9101 1213");
		UpiPayment upi = new UpiPayment("Gpay","asdfghjkilkjg");
		credit.process(10000);
		upi.process(50000);
	}

}
