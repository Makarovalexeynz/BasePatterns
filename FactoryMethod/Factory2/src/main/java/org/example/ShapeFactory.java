package org.example;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            throw new RuntimeException("Вид фигуры не может быть пустым!") ;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        throw new RuntimeException("Такой фигуры нет!");
    }
}
