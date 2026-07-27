package OOPS;

public class App {
    public static void main(String[] args) {
        // new object
        Student A = new Student();
        A.id = 1;
        A.name = "Nishit";
        A.nos = 5;
        // A.age = 19;
        System.out.println(A.id);
        // System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);
        A.bunk();
        A.study();
        A.sleep();
        // A.gfChatting();

        // parameterized ctor
        Student A1 = new Student(1, 19, "Nishit", 5, "Tina");
        System.out.println(A1.id);
        System.out.println(A1.getAge());
        A1.setAge(22);
        System.out.println(A1.getAge());
        System.out.println(A1.name);
        System.out.println(A1.nos);
        System.out.println(A1.getName());
    }
}
