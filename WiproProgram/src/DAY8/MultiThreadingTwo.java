package DAY8;

class Mul5 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("this is sai");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Mul6 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("This is new Program");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingTwo {
public static void main(String[] args) {
	Runnable m5=new Mul5();
	Runnable m6=new Mul6();
	
	//System.out.println(m2.getPriority());
	//m2.setPriority(Thread.MAX_PRIORITY);
	
	Thread t1=new Thread(m5);
	Thread t2=new Thread(m6);
	
	t1.start();
	t2.start();
	
}
}
