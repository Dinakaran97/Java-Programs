package MultiThreading;

public class NotifyWaitMain {
int amount=10000;
synchronized void withdraw(int wamount) {
	System.out.println("going to withdraw..."); 
	if(wamount>10000) {
		
		System.out.println("Less balance; waiting for deposit...");    
		try{
			System.out.println("before Waiting");
			wait();
			System.out.println("after Waiting");
			}catch(Exception e){
				e.printStackTrace();
			}    
	}    
	this.amount-=amount;    
	System.out.println("withdraw completed...");    
}
synchronized void deposit(int amount){    
	System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");    
		notify();    
}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NotifyWaitMain nw= new NotifyWaitMain();
new Thread() {
	public void run()
	{
		nw.withdraw(15000);
	}
}.start();

new Thread() {
	public void run()
	{
		nw.deposit(10000);
	}
}.start();

	}

}
