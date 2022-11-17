package MultiThreading;
class Mythread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("In side run method"+Thread.currentThread());
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
public class MultithreadingMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Mythread my=new Mythread();
my.setName("First thread");
my.start();
my.join();
Mythread my1= new Mythread();
my1.setName("Second thread");
my1.start();
my.join();

	}

}
