package com.ifmo.lesson2;
//import java.util.math;

public class ClosestToTen {
    /*
     Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
     переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
     */
    public static void main(String[] args) {
        float m = 8.5f;
        float n = 11.45f;

        float closestToTen = closestToTen(m, n);

        System.out.println(closestToTen);
    }

    public static float closestToTen(float m, float n) {
        // TODO implement
        float difN=10-n; //разница между числом и 10
        float difM=10-m;
        if (difN < 0) difN=difN*(-1); //если отриц беру модуль
        if (difM < 0) difM=difM*(-1);
        if (difM< difN)  //сравниваю модули
            return difM;
        else  return difN;
    }
}
