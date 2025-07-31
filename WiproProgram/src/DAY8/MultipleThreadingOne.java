package DAY8;

class Mul3 extends Thread{
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
class Mul4 extends Thread{
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
public class MultipleThreadingOne {
public static void main(String[] args) {
	Mul3 m3=new Mul3();
	Mul4 m4=new Mul4();
	//System.out.println(m2.getPriority());
	//m2.setPriority(Thread.MAX_PRIORITY);
	m3.start();
	try {
		Thread.sleep(5);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	m4.start();
	
}
}
