package com.ifmo.lesson5;

public class ShapeMain {

    public static void main(String[] args){
        Shape shape1 = new Shape();
        shape1.CalculateArea();

        Triangle triangle1 = new Triangle(2,3);
        triangle1.CalculateArea();

        Rectangle rectangle1 = new Rectangle(3, 4);
        rectangle1.CalculateArea();

        Oval oval1 = new Oval(1, 2);
        oval1.CalculateArea();

        SquareTriangle squareTriangle1 = new SquareTriangle(2,4);
        squareTriangle1.CalculateArea();

        Square square1= new Square(4);
        square1.CalculateArea();

        Circle circle1= new Circle(2);
        circle1.CalculateArea();

    }
}
