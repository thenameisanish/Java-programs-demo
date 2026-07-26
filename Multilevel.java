// Multilevel inheritance example
class Vechile {
    Vechile() {
        System.out.println("This is vechile (Grandparent)");
    }
}


class Car extends Vechile {
    Car() {
        System.out.println("This is car (Parent)");
    }
}


class SportsCar extends Car {
    SportsCar() {
        System.out.println("This is sports car");
    }
}
public class Multilevel {
    public static void main(String[] args){
    SportsCar objCar=new SportsCar();
    
    

    }

}
