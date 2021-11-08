package com.ifmo.lesson5;

public class SquareTriangle extends Triangle{ //прямоугольный треугольник

    public SquareTriangle(){
        name = "прямоугольный треугольник";
    }
    public SquareTriangle(int a, int b){
        this.a=a;
        this.h=b;
        name = "прямоугольный треугольник";
    }

    @Override
    public double CalculateArea(){
        //area=0.5*a*h;
        //System.out.println("Площадь фигуры " + name + " = " + area);
        return  0.5*a*h;
    }
}
