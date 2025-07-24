package DAY5;


class Rent {
    double rentAmount;
    int expensesAmount;
    double electricityExpense;

    public Rent() {
    }

    public void rent_money(int rentValue, int expensesValue) {
        this.rentAmount = rentValue;
        this.expensesAmount = expensesValue;
        System.out.println("rent is=" + rentValue);
        System.out.println("expenses are=" + expensesValue);
        System.out.println(rentValue + expensesValue);
    }

    public void rent_money(double rentValue, double electricityValue) {
        this.rentAmount = rentValue;
        this.electricityExpense = electricityValue;
        System.out.println("rent is=" + rentValue);
        System.out.println("expenses are=" + electricityValue);
        System.out.println(rentValue + electricityValue);
    }
}



public class Propertynormal {

    public static void main(String[] args) {
        Rent R = new Rent();
        R.rent_money(5000.0, 7000.0);
        R.rent_money(5000.0, 6000.0);
    }
}