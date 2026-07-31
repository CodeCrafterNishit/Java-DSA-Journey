package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 180, 4);

        Motorcycle bike = new Motorcycle("Yamaha", 140, true);

        Truck truck = new Truck("Tata", 90, 15);

        System.out.println("===== CAR =====");
        car.Start();
        car.displayCarInfo();
        car.StartAc();
        car.Stop();

        System.out.println();

        System.out.println("===== MOTORCYCLE =====");
        bike.Start();
        bike.displayBikeInfo();
        bike.wheelie();
        bike.Stop();

        System.out.println();

        System.out.println("===== TRUCK =====");
        truck.Start();
        truck.displayTruckInfo();
        truck.loadGoods();
        truck.Stop();
    }
}