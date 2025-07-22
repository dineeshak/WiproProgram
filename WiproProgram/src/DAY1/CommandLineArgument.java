package DAY1;

public class CommandLineArgument {
	public static void main(String[] args) {
		if (args.length < 2) 
		{
		System.out.println("Please provide two numbers.");
		return;
		}
		try
		{
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]);
		System.out.println("The Sum is:" +(a + b));
		}
		
		catch (NumberFormatException e) {
		System.out.println("Invalid integer input: " + e.getMessage());
}
		}
}
