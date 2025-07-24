package DAY5;


//Abstract class instead of interface
abstract class WiproSystem {
 abstract void deviceType();
 abstract void compilespeed();
}

class Desktops extends WiproSystem {
 public void deviceType() {
     System.out.println("Wipro provides device:DESKTOP");
 }
 public void compilespeed() {
     System.out.println("Code is compiled faster in Desktop");
 }
}

class Laptops extends WiproSystem {
 public void deviceType() {
     System.out.println("Wipro provides device:LAPTOP");
 }
 public void compilespeed() {
     System.out.println("Code is compiled slower in Laptop");
 }
}

public class WiproDeviceAbstract {
 public static void main(String[] args) {
     WiproSystem laptop = new Laptops();
     laptop.deviceType();
     laptop.compilespeed();

     WiproSystem desktop = new Desktops();
     desktop.deviceType();
     desktop.compilespeed();
 }
}
