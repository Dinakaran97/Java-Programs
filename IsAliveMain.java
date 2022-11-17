package MultiThreading;
class Alive extends Thread{

	public void print() {
		System.out.println("is alive");
	}
	
}
public class IsAliveMain  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Alive is=new  Alive();
Thread t=new Thread(is) {
	public void run() {
		is.print();
	}
};
System.out.println("Is First Thread is Alive"+t.isAlive());
t.setName("First Thread");
t.start();
System.out.println("Is First Thread is Alive"+t.isAlive());
t.join();
System.out.println("Is First Thread is Alive"+t.isAlive());
Thread t2=new Thread(is) {
	public void run() {
		is.print();
	}
};
System.out.println("Is First Thread is Alive"+t.isAlive());
t2.setName("Second Thread");
t2.start();
System.out.println("Is First Thread is Alive"+t.isAlive());

	}

}
