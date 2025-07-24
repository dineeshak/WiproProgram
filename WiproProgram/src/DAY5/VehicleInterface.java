package DAY5;


interface Vehicle_driving {
    void speed();
    void brand();
}

class Cars implements Vehicle_driving {
    public void speed() {
        System.out.println("speed of the car : 4km/hr");
    }
    public void brand() {
        System.out.println("brand is: audi");
    }
}

class Bikes implements Vehicle_driving {
    public void speed() {
        System.out.println("speed of the bike : 4km/hr");
    }
    public void brand() {
        System.out.println("brand is: yamaha");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
    	Vehicle_driving vd = new Cars();
        vd.speed();
        vd.brand();

        Vehicle_driving vd1 = new Bikes();
        vd1.brand();
        vd1.speed();
    }
}
