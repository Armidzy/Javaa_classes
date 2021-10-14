package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        int pred=1;
        int current=1;
        int help;
        System.out.println(1);
        System.out.println(1);
        for (int i=1; i <10; i++){
            help=current;
            current += pred ;
            System.out.println(current);
            pred=help;
        }
    }
}
