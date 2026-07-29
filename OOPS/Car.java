package OOPS;

public class Car extends vehicle {
    int doors;

    public Car(String Brand, int speed, int doors) {
        super(Brand, speed);
        this.doors = doors;
    }

    public void StartAc() {
        System.out.println("Start Ac");
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors : " + doors);
    }
}
