package DAY3;
class Employe {
    private String name;
    private double salary;

    // Getter and Setter
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employe emp = new Employe();
        emp.setName("Dineesha");
        emp.setSalary(40000);
        emp.display();
    }
}


