package com.ifmo.lesson5;

public class Rectangle extends Shape{  //прямоугольник
    int a, b;

    public Rectangle(){
        name = "прямоугольник";
    }

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
        name = "прямоугольник";
    }

    @Override
    public double CalculateArea(){
       // area=a*b;
        //System.out.println("Площадь фигуры " + name + " = " + area);
        return a*b;
    }
}
