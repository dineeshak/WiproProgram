package DAY5;

interface Realestates {
    void home();
    void apartment();
}

class Edward implements Realestates {
    public void home() {
        int food = 10000;
        double rent = 14000.00;
        int expenses = 20000;
        double total = food + rent + expenses;
        System.out.println("The total cost of Edward home is: " + total);
    }

    public void apartment() {
        int food = 40000;
        double rent = 50000.00;
        int expenses = 60000;
        double total = food + rent + expenses;
        System.out.println("The total cost of Edward apartment is: " + total);
    }
}

class Bella implements Realestates {
    public void home() {
        int food = 14000;
        double rent = 24000.00;
        int expenses = 60000;
        double total = food + rent + expenses;
        System.out.println("The total cost of Bella home is: " + total);
    }

    public void apartment() {
        int food = 50000;
        double rent = 60000.00;
        int expenses = 70000;
        double total = food + rent + expenses;
        System.out.println("The total cost of Bob apartment is: " + total);
    }
}

public class PropertyInterface {
    public static void main(String[] args) {
        Realestates rs = new Edward();
        rs.home();
        rs.apartment();

        Realestates rs1 = new Bella();
        rs1.home();
        rs1.apartment();
    }
}
