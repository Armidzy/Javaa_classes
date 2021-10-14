package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        for (int i=0; i <20; i++){
            System.out.println(fibonacciNumbers[i]);
        }
        // TODO implement
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fibonacciNumbers = new int[20];

        fibonacciNumbers[0]=1;
        fibonacciNumbers[1]=1;
        for (int i=2; i <20; i++){
            fibonacciNumbers[i]=fibonacciNumbers[i-1]+ fibonacciNumbers[i-2];
        }

        return fibonacciNumbers;
    }

}
