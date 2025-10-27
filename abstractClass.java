// abstract class they can't be initialize
abstract class Car {

    // abstract method for defining abstract method you need abstract class
    public abstract void drive();

    public void music() {
        System.out.println("Music is plying");
    }
}

// it is necessary to define abstract methods in child class if it not abstract class

class WagonR extends Car {
    public void drive() {
        System.out.println("Car is auto pilot");
    }
}


public class abstractClass {
    public static void main(String[] args) {
        
    }
}
