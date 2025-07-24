package DAY5;
import java.util.Calendar;
public class Calender {
	
	    public static void main(String[] args) {
	        // Create a Calendar object representing the current date and time
	        Calendar calendar = Calendar.getInstance();
	       
	        // Print the current date and time
	        System.out.println("Current Date and Time: " + calendar.getTime());
	        // Set a specific date (e.g., January 15, 2025)
	        calendar.set(Calendar.YEAR, 2025);
	        calendar.set(Calendar.MONTH, Calendar.JANUARY);  // Note: Months are 0-based (0 = January)
	        calendar.set(Calendar.DAY_OF_MONTH, 15);
	        System.out.println("Specific Date (January 15, 2025): " + calendar.getTime());
	        // Add 10 days to the current date
	        calendar.add(Calendar.DAY_OF_MONTH, 10);
	        System.out.println("Date after adding 10 days: " + calendar.getTime());
	        // Subtract 1 month from the current date
	        calendar.add(Calendar.MONTH, -1);
	        System.out.println("Date after subtracting 1 month: " + calendar.getTime());
	    }
	}
//Getting the Current Date and Time:
//Calendar.getInstance() creates a Calendar object initialized to the current date and
//time based on the system's clock.
//calendar.getTime() converts the Calendar object to a Date object,
//which can be printed in a human-readable format.
//Setting a Specific Date:
//The set() method is used to set the year, month, and day to a specific date.
//Here, we set it to January 15, 2025.
//Note: The month values in Calendar are 0-based, so Calendar.JANUARY corresponds to 0,
//which represents January.
//Adding or Subtracting Time:
//calendar.add(Calendar.DAY_OF_MONTH, 10) adds 10 days to the current date.
//calendar.add(Calendar.MONTH, -1) subtracts 1 month from the current date.
