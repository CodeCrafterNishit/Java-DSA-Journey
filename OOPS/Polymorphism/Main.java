package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        doDrawing(c);
        Rect r = new Rect();
        doDrawing(r);
        Shape s = new Shape();
        doDrawing(s);
    }

    public static void doDrawing(Shape s) {
        s.Draw();
    }

}
