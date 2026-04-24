interface Vehicle {

    class Car {
        public void start() {
            System.out.println("Машина заведена");
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        Vehicle.Car car = new Vehicle.Car();
        car.start();
    }
}