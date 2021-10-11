package com.ifmo.lesson2;
import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
    	Random random = new Random();
    	return random.nextInt(900) + 100;
    }

    public static String largestDigit(int rnd) {
        // TODO implement

        int max = 0;
        int a, b, c;
        a= rnd % 10;
        b= rnd/10 % 10;
        c= rnd/100;
        if (a>b)
        	if (a>c)
        		max =a;
        	else max =c;
        else if (b>c)
        	max =b;
        else max =c;

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
