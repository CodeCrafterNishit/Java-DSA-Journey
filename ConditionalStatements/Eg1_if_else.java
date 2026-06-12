public class Eg1_if_else {
    public static void main(String[] args) {
        int Age = 10;
        if (Age >= 18) {
            System.out.println("Can vote and drive");
        }

        if (Age > 13 && Age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Cannot vote and drive");
        }
    }
}
