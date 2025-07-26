package DAY7;


import java.util.Scanner;

public class FactorialException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // to read user input

        try {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            if (num < 0) {
                throw new IllegalArgumentException(" Factorial is not defined for negative numbers.");
            }

            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println(" Factorial of " + num + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            // Catches other exceptions, like if user enters text instead of a number
            System.out.println("Invalid input! Please enter an integer number.");
        } finally {
            System.out.println("Finally block: Always runs, closing resources.");
            scanner.close(); // close the scanner to free resources
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
