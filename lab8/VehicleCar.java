package javafullstack;
public class VehicleCar {
    String brand;
    String model;
    int year;

    public VehicleCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(brand + " " + model + " " + year +" ");
    }

    public static class Car {
        String color;
        VehicleCar vehicle;

        public Car(String color, VehicleCar vehicle) {
            this.color = color;
            this.vehicle = vehicle;
        }

        public void honk() {
            System.out.println(color);
            
        }
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	VehicleCar vehicle = new VehicleCar("Toyota", "Supra", 1978);
        Car car = new Car("White", vehicle);
        vehicle.drive();
        car.honk();
    }
}
