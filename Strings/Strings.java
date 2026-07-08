package Strings;
public class Strings {
    public static void main(String[] args) {
        // String firstName = "Nishit";
        // String lastName = new String("Jain");
        // System.out.println(firstName + " " + lastName);
        // // String methods
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(1));
        // //trying different comparisons == equals() equals
        // String name1 = "NishitJain";
        // String name2 = "NishitJain";
        // if (name1.equals(name2)) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }
        String str = " ";
        System.out.println(str.length());
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        String name = " Nishit ";
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
