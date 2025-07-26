package DAY7;


public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array with 5 elements (index 0–4)

        try {
            System.out.println("Trying to access the 6th element...");
            int value = numbers[5]; // This is index 5, which is the 6th element
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Exception caught: " + e);
        } finally {
            System.out.println("Finally block: This always runs, even if there was an exception.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}
