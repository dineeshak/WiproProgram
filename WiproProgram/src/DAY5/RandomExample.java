package DAY5;
import java.util.Random;
public class RandomExample {
	
	
	    public static void main(String[] args) {
	        Random random = new Random();
	        int randomNumber = random.nextInt(1000);  // Random number between 0 and 99
	        System.out.println("Random number: " + randomNumber);
	    }
	}
//A class that provides methods for generating random numbers.
//Summary of Key Classes in java.util:
//Collections: Useful for managing groups of objects (List, Set, Map, etc.).
//Scanner: For reading user input.
//Random: For generating random values.
//Date and Time: For handling dates and times (Date, Calendar, LocalDate, LocalTime).
//Arrays: For manipulating arrays.
