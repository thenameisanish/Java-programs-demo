//single inheritance example
class Vechile {
    Vechile() {
        System.out.println("This is vechile");
    }
}

class Car extends Vechile {
    Car() {
        System.out.println("This is car");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}