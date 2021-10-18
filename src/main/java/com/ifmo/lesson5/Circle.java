package com.ifmo.lesson5;

public class Circle extends Oval{

    public Circle(){
        name = "круг";
    }

    public Circle(int r){
        this.a=r;
        name = "круг";
    }

    @Override
    public void CalculateArea(){
        area=a*a*Math.PI;
        System.out.println("Площадь фигуры " + name + " = " + area);
    }
}
