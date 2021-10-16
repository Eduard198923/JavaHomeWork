package homework7;

public class ShapeApp {
    public static void main(String[] args) {
        NewShape circle = new NewShape(new Circle());
        NewShape triangle = new NewShape(new Triangle());
        NewShape quad = new NewShape(new Quad());
        NewShape star = new NewShape(new Star());
        NewShape rectangle = new NewShape(new Rectangle());
    }
}
