package homework7;





public class Shape {
   private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void returnName() {
        System.out.println("Shape: " + name);
    }

}
   class Circle extends Shape {


      public Circle(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Circle: " + getName());
    }
}

class Triangle extends Shape {


    public Triangle(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Triangle: " + getName());
    }
}

class Quad extends Shape {


    public Quad(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Quad: " + getName());
    }
}

class Star extends Shape {


    public Star(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Star: " + getName());
    }
}

class Rectangle extends Shape {


    public Rectangle(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Rectangle: " + getName());
    }
}