package DAY6;

//Define interface A
interface A {
 void show();          // common method
 void displayA();      // unique method for A
}

//Define interface B
interface B {
 void show();          // common method
 void displayB();      // unique method for B
}

//Define interface C
interface C {
 void show();          // common method
 void displayC();      // unique method for C
}

//Class implementing all three interfaces
class MyClass implements A, B, C {
 // Only one implementation needed for common method 'show'
 public void show() {
     System.out.println(" Common show() method implemented in MyClass");
 }

 // Implement unique methods
 public void displayA() {
     System.out.println(" Display from interface A");
 }

 public void displayB() {
     System.out.println("Display from interface B");
 }

 public void displayC() {
     System.out.println(" Display from interface C");
 }
}

//Main class to run the program
public class MultipleInterface {
 public static void main(String[] args) {
     // Create object of MyClass
     MyClass obj = new MyClass();

     // Call common method directly
     obj.show();

     // Call unique methods directly
     obj.displayA();
     obj.displayB();
     obj.displayC();

     System.out.println("---- Using interface references ----");

     // Create references of interface types
     A a = obj;
     B b = obj;
     C c = obj;

     // Call common method through each interface reference
     a.show();
     b.show();
     c.show();

     // Call unique methods via interface references
     a.displayA();
     b.displayB();
     c.displayC();
 }
}
