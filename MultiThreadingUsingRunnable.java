package MultiThreading;
class Myclass1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("threading"+Thread.currentThread());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class MultiThreadingUsingRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Myclass1 my=new Myclass1();
Thread t=new Thread(my);
t.setName("first thread");
t.start();
t.join();
Myclass1 my1=new Myclass1();
Thread t1=new Thread(my1);
t1.setName("second thread");
t1.start();
t1.join();
	}

}
