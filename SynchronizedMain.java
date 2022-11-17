package MultiThreading;
class Table {
	synchronized void methodPrint(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println((num+"x"+i+"="+num*i));
		}
	}
	
}
class MyThread1 extends Thread{
	Table tob1;
	MyThread1(Table t){
		tob1=t;
	}
	public void run() {
		tob1.methodPrint(2);
	}
	
}
class MyThread2 extends Thread{
	Table tob2;
	MyThread2(Table t){
		tob2=t;
	}
	public void run() {
		tob2.methodPrint(5);
	}
}

public class SynchronizedMain {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Table t= new Table();
		MyThread1 my=new MyThread1(t);
		my.setName("First Thread");
		my.start();
		
		MyThread2 my2=new MyThread2(t);
		my2.setName("Second Thread");
		my2.start();

	}

}
