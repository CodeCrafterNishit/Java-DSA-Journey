package OOPS;

public class Motorcycle extends vehicle {

    boolean hasHelmet;

    public Motorcycle(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie!");
    }

    public void displayBikeInfo() {
        displayInfo();
        System.out.println("Helmet Available: " + hasHelmet);
    }

}