package com.ifmo.lesson3;
import java.util.Random;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
        System.out.println(isIncreasingSequence(randomNumbers));
    }

    public static int[] randomNumbers() {
        // TODO implement
        int mas[]=new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            mas[i]= random.nextInt(89) + 10;
        }
        // random.nextInt(900) + 100;
        return mas;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement
        //if ( randomNumbers[3]>randomNumbers[2] &&  randomNumbers[2]>randomNumbers[1] && randomNumbers[1]>randomNumbers[0] )
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i-1] > randomNumbers[i])
                return false;
        }
        return true;
    }
}
