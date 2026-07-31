package OOPS.Inheritance;

public class Truck extends vehicle {

    int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    public void loadGoods() {
        System.out.println("Truck is loading goods.");
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}