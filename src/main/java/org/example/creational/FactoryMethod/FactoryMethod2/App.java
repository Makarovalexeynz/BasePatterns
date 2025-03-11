package org.example.creational.FactoryMethod.FactoryMethod2;


public class App 
{
    public static void main( String[] args )
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.drow();

        Shape square = shapeFactory.getShape("SQUARE");
        square.drow();
    }
}
