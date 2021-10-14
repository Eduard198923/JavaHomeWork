package homework7;

class Rectangle extends Shape {


    public Rectangle(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Rectangle: " + getName());
    }
}