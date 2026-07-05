public class Strings {
    public static void main(String[] args) {
        String firstName = "Nishit";
        String lastName = new String("Jain");
        System.out.println(firstName + " " + lastName);
        // String methods
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(1));
        //trying different comparisons == equals() equals
        String name1 = "NishitJain";
        String name2 = "NishitJain";
        if (name1.equals(name2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
