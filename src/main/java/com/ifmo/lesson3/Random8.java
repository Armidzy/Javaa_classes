package com.ifmo.lesson3;
import java.util.Random;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        arrayoutput(randomNumbers);

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        arrayoutput(replacedWithZeros);
    }

    public static int[] randomNumbers() {
        Random random = new Random();
        int[] arr= new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i]=random.nextInt(9)+1;
        }

        return arr;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        int[] neewarr= randomNumbers.clone();
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0 && i != 0)
                neewarr[i]=0;
        }
        return neewarr;
    }

    public static void arrayoutput(int[] randomNumbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(randomNumbers[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
