package com.ifmo.lesson3;
import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        arrayoutput(randomNumbers1);
        arrayoutput(randomNumbers2);

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);


        System.out.println(average1);
        System.out.println(average2);
    }

    public static int[] randomNumbers() {
        Random random = new Random();

        int[] mas=new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i]= random.nextInt(5);
        }
        return mas;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int arrSum= 0;
        for (int i = 0; i < 5; i++) {
            arrSum+= randomNumbers[i];
        }

        return arrSum/5;
    }

    public static void arrayoutput(int[] randomNumbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(randomNumbers[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

}
