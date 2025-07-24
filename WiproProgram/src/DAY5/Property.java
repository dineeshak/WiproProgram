package DAY5;


abstract class Realestate {
    abstract void home();
    abstract void apartment();
}

class Alice extends Realestate {
    void home() {
        int food = 10000;
        double rent = 14000.00;
        int expenses = 20000;
        double total = (double)(food + rent + expenses);
        System.out.println("The total cost of Alice home is: " + total);
    }

    void apartment() {
        int food = 40000;
        double rent = 50000.00;
        int expenses = 60000;
        double total = (double)(food + rent + expenses);
        System.out.println("The total cost of Alice apartment is: " + total);
    }
}

class Bob extends Realestate {
    void home() {
        int food = 14000;
        double rent = 24000.00;
        int expenses = 60000;
        double total = (double)(food + rent + expenses);
        System.out.println("The total cost of Bob home is: " + total);
    }

    void apartment() {
        int food = 50000;
        double rent = 60000.00;
        int expenses = 70000;
        double total = (double)(food + rent + expenses);
        System.out.println("The total cost of Bob apartment is: " + total);
    }
}

public class Property {
    public static void main(String[] args) {
        Realestate rs = new Alice();
        rs.home();
        rs.apartment();

        Realestate rs1 = new Bob();
        rs1.home();
        rs1.apartment();
    }
}