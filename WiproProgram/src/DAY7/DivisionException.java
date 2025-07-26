package DAY7;
//Exception Handling


public class DivisionException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {          //or catch(Exception e)
            System.out.println("⚠️ Cannot divide by zero! " + e);
        }
        System.out.println("Program continues after catch block.");
    }
}
