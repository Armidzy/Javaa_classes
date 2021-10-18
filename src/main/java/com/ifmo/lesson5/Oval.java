package com.ifmo.lesson5;

public class Oval extends Shape{
    int a;  //большая полуось
    int b;  //малая полуось

    public Oval(){
        name = "овал";
    }

    public Oval(int a, int b){
        this.a=a;
        this.b=b;
        name = "овал";
    }

    @Override
    public void CalculateArea(){
        area=a*b*Math.PI;
        System.out.println("Площадь фигуры " + name + " = " + area);
    }
}
