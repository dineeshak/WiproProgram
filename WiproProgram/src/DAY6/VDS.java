package DAY6;

interface DemoInterface {
    void normalMethod(); // abstract method (must be implemented by class)

    default void defaultMethod() {
        System.out.println(" defaultMethod() inside interface");
    }

    static void staticMethod() {
        System.out.println(" staticMethod() inside interface");
    }
}

// Class implements interface
class DemoClass implements DemoInterface {
    public void normalMethod() {
        System.out.println("normalMethod() implemented in DemoClass");
    }
}

public class VDS {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();

        // Call normal method
        obj.normalMethod();

        // Call default method
        obj.defaultMethod();

        // Call static method (using interface name, not object)
        DemoInterface.staticMethod();
    }
}
