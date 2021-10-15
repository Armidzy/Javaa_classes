package com.ifmo.lesson3;
import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append(randomNumbers[i]).append(" ");
        }
        System.out.println(sb.toString());

        int evens = evens(randomNumbers);

        System.out.println(evens);
    }

    public static int[] randomNumbers() {
        Random random = new Random();
        int[] arr= new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i]=random.nextInt(10);
        }
        return arr;
    }

    private static int evens(int[] arr) {
        int count =0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0 && arr[i]!= 0)
                count++;
        }
        return count;
    }
}
