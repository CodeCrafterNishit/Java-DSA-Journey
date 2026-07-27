package OOPS;

//class is a blueprint
public class Student {

    // attributes
    public int id;
    public String name;
    private int age;
    public int nos;
    private String gf;

    public String getName() {
        return this.gf;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a) {
        if (a<100)
            this.age = a;
        return;
    }

    // default ctor
    public Student() {
        System.out.println("student default constructor called");
    }

    // parameterized ctor
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // Methods / behaviours
    public void study() {
        System.out.println(name + " is Studying");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public void bunk() {
        System.out.println(name + " is Bunking");
    }

    // private void gfChatting() {
    // System.out.println("chatting with " + gf);
    // }
}
