package com.ifmo.lesson5;

public class Square extends Rectangle{

    public Square(){
        name="квадрат";
    }

    public Square(int a){
        this.a=a;
        name="квадрат";
    }

    @Override
    public double CalculateArea(){
        //area=a*a;
        //System.out.println("Площадь фигуры " + name + " = " + area);
        return a*a;
    }
}
