package homework7;

class Star extends Shape {


    public Star(String name){
        super(name);
    }


    @Override
    public void returnName() {
        System.out.println("Star: " + getName());
    }
}