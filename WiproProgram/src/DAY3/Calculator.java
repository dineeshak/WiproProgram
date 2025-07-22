package DAY3;

public class Calculator {
	class Calculator1 {
	public int add(int a, int b) 
	{
	return a+b;
	}
	public double add(double a, double b) 
	{
	return a+b;
	}
	public static void main (String[] args) {

	
	Calculator c = new Calculator();
	Calculator1 cl = c.new Calculator1();
	System.out.println("Sum of Integers:" + cl.add (10, 20)) ;
	System.out.println("Sum of Numbers:" + cl.add (1.1, 2.34));
}
}
}