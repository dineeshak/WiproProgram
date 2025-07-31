package DAY8;

class Mul1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("this is sai");
        }
    }
}

class Mul2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is new Program");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Mul1());
        Thread t2 = new Thread(new Mul2());

        t1.start();  // starts Mul1 thread
        t2.start();  // starts Mul2 thread
    }
}

/*package DAY8;


class Mul3 extends Thread{
    public void display() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("this is sai");
        }
    }
}

class Mul4 extends Thread{
    public void display() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("This is new Program");
        }
    }
}

public class MultipleThreadingOne {
    public static void main(String[] args) {
        Mul3 m1 = new Mul3();
        Mul4 m2 = new Mul4();

        m1.display();
        m2.display();
    }
}*/ 