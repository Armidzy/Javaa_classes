package com.ifmo.lesson5;

public class Shape {
    double area=0;
    String name = "неопознанная фигура";

    public void CalculateArea(){
        System.out.println("Площадь фигуры " + name + "= " + area);
    }
}
