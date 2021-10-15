package com.ifmo.lesson3;

import java.util.Random;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(randomNumbers[i]).append(" ");
        }
        System.out.println(sb.toString());

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        System.out.println(maxLastIndex);
    }

    public static int[] randomNumbers() {
        Random random = new Random();
        int[] arr= new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i]=random.nextInt(31) - 15;
        }
        return arr;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max=-15;

        for (int i = 0; i < 12; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
        int ind=-1;
        for (int i = 0; i < 12; i++) {
            if (randomNumbers[i] == max)
                ind=i;
        }
        return ind;
    }
}
