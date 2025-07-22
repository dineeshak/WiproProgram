package DAY2;

public class Return {
	
	    public static void main(String[] args) {
	        print();
	    }

	    public static void print() {
	        System.out.println("Before return");
	        return;
	        // System.out.println("After return"); // unreachable code
	    }
	
}
