package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
        double Discriminant= Math.pow(b, 2) - 4*a*c;
        double[] roots= new double[2];
        if (Discriminant < 0)
            return null;
        /*else if (Discriminant == 0){
            roots1[0]=-b/(2*a);
            return roots1;}*/
        else{
            roots[0]=(-b+Math.sqrt(Discriminant))/(2*a);
            roots[1]=(-b-Math.sqrt(Discriminant))/(2*a);
            return roots;
        }
    }
}
