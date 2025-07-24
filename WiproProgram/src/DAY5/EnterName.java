package DAY5;

import java.util.Scanner;  // Import the Scanner class for user input
public class EnterName {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the user's input as a string
        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the Java program.");
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
//jJava util package: This line is used to import the Scanner class from the java.util
//package so you can use it in your program.
//The java.util package in Java is one of the core libraries that provides a wide range of
//utility classes and interfaces to help with common tasks,
//such as handling collections (lists, sets, maps), date and time operations, and more.

//List: An ordered collection (e.g., ArrayList, LinkedList).
//Set: A collection that doesn't allow duplicate elements (e.g., HashSet, TreeSet).
//Map: A collection that stores key-value pairs (e.g., HashMap, TreeMap).
//Queue: A collection designed for holding elements before processing (e.g., PriorityQueue, LinkedList).

