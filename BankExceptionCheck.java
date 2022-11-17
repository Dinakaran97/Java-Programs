package Edubridgeprograms;

import java.util.Scanner;
@SuppressWarnings("serial")
class lowbalance extends Exception{
	lowbalance(String s){
		super(s);
	}
}
public class BankExceptionCheck {
public void checkbalance() {
	double minbalance=1000;
	double withdraw;
	double bal=0;
	double amtinaccount=10000;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to be withdrawn:");
	withdraw=sc.nextDouble();
	try {
		bal=amtinaccount-withdraw;
		if(bal<minbalance) {
			throw new lowbalance("Your balance is low");
		}
	}
	catch(lowbalance e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("Balance="+bal);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankExceptionCheck b=new BankExceptionCheck();
b.checkbalance();
	}

}
