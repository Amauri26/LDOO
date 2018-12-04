package Practica10;

public class FactoryPatternDemo {
    public static void main(String [] args){
        ShapeFactory shapes= new ShapeFactory();
         Shape shape1 = shapes.getShape("Circle");
         shape1.draw();
         Shape shape2 = shapes.getShape("Square");
         shape2.draw();
         Shape shape3 = shapes.getShape("Rectangle");
         shape3.draw();
    }
    
}
