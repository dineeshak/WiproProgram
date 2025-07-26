package DAY6;

//Interface First
interface First {
 // abstract method
 void displayFirst();

 // default method
 default void defaultMethod() {
     System.out.println(" Default method from Interface First");
 }

 // static method
 static void staticMethod() {
     System.out.println(" Static method from Interface First");
 }
}

//Interface Second
interface Second {
 void displaySecond();

 default void defaultMethod() {
     System.out.println(" Default method from Interface Second");
 }

 static void staticMethod() {
     System.out.println(" Static method from Interface Second");
 }
}

//Class implementing both interfaces
class CombinedClass implements First, Second {
 // Implement abstract methods
 public void displayFirst() {
     System.out.println(" displayFirst() implemented in CombinedClass");
 }

 public void displaySecond() {
     System.out.println(" displaySecond() implemented in CombinedClass");
 }

 // Resolve conflict between defaultMethod() from First and Second
 public void defaultMethod() {
     System.out.println(" Overridden defaultMethod() in CombinedClass to resolve conflict");
 }
}


public class Midvs {
 public static void main(String[] args) {
     CombinedClass obj = new CombinedClass();

     // Call overridden default method
     obj.defaultMethod();

     // Call abstract methods (implemented in class)
     obj.displayFirst();
     obj.displaySecond();

     // Call static methods from interfaces
     First.staticMethod();
     Second.staticMethod();
 }
}
