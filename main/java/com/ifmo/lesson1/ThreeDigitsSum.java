package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /*
    В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n = 123;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {
        // TODO implement
        // for (int i=0; i<=2; i++)
        return  return  n % 10 + (n % 100- n % 10)/10 + (n % 1000 - n % 100)/100;
    }
}
