package com.ifmo.lesson5;

public class Triangle extends Shape{ //треугольник
    int a; //основание
    int h;  //высота

    public Triangle(){
        name = "треугольник";
    }

    public Triangle(int a, int h){
        this.a=a;
        this.h=h;
        name = "треугольник";
    }

    @Override
    public void CalculateArea(){
        area=0.5*a*h;
        System.out.println("Площадь фигуры " + name + " = " + area);
    }
}
