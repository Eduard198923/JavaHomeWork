package homework7;

public class ShapeApp {
    public static void main(String[] args) {


        Circle circle = new Circle("circle");
        Triangle triangle = new Triangle("triangle");
        Quad quad = new Quad("quad");
        Star star = new Star("star");
        Rectangle rectangle = new Rectangle("rectangle");


        circle.returnName();
        triangle.returnName();
        quad.returnName();
        star.returnName();
        rectangle.returnName();


    }
}
