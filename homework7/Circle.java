package homework7;

class Circle extends Shape {


    public Circle(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Circle: " + getName());
    }
}