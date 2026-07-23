package OOPS;

//class is a blueprint
public class Student {

    //attributes
    public int id;
    public String name;
    public int age;
    public int nos;

    //default ctor
    public Student(){
        System.out.println("student default constructor called");
    }

    //parameterized ctor
    public Student(int id,int age,String name,int nos){
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Methods / behaviours
    public void study(){
        System.out.println(name + " is Studying");
    } 
    public void sleep(){
        System.out.println(name + " is Sleeping");
    }
    public void bunk(){
        System.out.println(name + " is Bunking");
    }
}
