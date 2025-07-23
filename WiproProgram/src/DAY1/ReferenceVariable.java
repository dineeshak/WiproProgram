package DAY1;   

class Persons {     
    String name;     
    Persons(String name) { 
        this.name = name; 
    }     
    public String toString() { 
        return name; 
    } 
} 

public class ReferenceVariable {     
    public static void changeName(Persons p) {         
        p.name = "Changed";     
    }     
    public static void main(String[] args) {         
        int x = 10;         
        int y = x;         
        y = 20;         
        System.out.println("x = " + x); // stays 10         
        Persons p1 = new Persons("ayz");         
        Persons p2 = p1;         
        p2.name = "abc";         
        System.out.println("p1 = " + p1); //         
        changeName(p1);         
        System.out.println("p1 after changeName = " + p1);     
    } 
}



