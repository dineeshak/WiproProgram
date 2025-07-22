package DAY3;

public class BankAccmain {
	public static void main (String[] args) {
		
	
			BankAccount b = new BankAccount ("Om", 1000) ;
			b.deposit(2000);
			b.withdraw(500) ;
			b.displayDetails();
}
}