package MultiThreading;
class sync{
	synchronized void methodPrint(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println((num+"x"+i+"="+num*i));
		}
	}
}
public class SynchronizedMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SynchronizedMain s=new SynchronizedMain();
sync s1=new sync();
Thread t=new  Thread()
{
 public void run() {
	 s1.methodPrint(2);
 }
};t.start();
Thread t2=new  Thread()
{
 public void run() {
	 s1.methodPrint(5);
 }
};t2.start();
	}

}
