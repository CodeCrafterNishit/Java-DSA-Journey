package OOPS.Inheritance;

public class vehicle {
    // attributes
    String Brand;
    int speed;

    // parameterized ctor
    public vehicle(String Brand, int speed) {
        this.Brand = Brand;
        this.speed = speed;
    }

    //vehicle methods
    public void Start() {
        System.out.println(Brand + "Vehicle Starting");
    }

    //vehicle methods
    public void Stop() {
        System.out.println(Brand + "Vehicle Stopped");
    }

    public void displayInfo() {
        System.out.println("Brand" + Brand);
        System.out.println("Speed" + speed);
    }
}