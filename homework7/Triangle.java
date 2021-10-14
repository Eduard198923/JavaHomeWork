package homework7;


    class Triangle extends Shape {


        public Triangle(String name){
            super(name);
        }


        @Override
        public void returnName() {
            System.out.println("Triangle: " + getName());
        }
    }

