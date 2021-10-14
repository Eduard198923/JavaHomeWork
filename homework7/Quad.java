package homework7;

class Quad extends Shape {


    public Quad(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Quad: " + getName());
    }
}