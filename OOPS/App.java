package OOPS;

public class App {
    public static void main(String[] args) {
        Student A = new Student();
        A.id = 1;
        A.name = "Nishit";
        A.nos = 5;
        A.age = 19;
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);
        A.bunk();
        A.study();
        A.sleep();

        //parameterized ctor
        Student A1 = new Student(1,19,"Nishit",5);
         System.out.println(A1.id);
        System.out.println(A1.age);
        System.out.println(A1.name);
        System.out.println(A1.nos);
    }
}
