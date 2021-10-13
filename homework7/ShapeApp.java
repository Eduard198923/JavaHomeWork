package homework7;

public class ShapeApp {
    public static void main(String[] args) {
        Shape shapes = new Shape("Фигуры");
        Circle circle = new Circle("круг");
        Triangle triangle = new Triangle("треугольник");
        Quad quad = new Quad("квадрат");
        Star star = new Star("звезда");
        Rectangle rectangle = new Rectangle("прямоугольник");

        shapes.returnName();
        circle.returnName();
        triangle.returnName();
        quad.returnName();
        star.returnName();
        rectangle.returnName();


    }
}
