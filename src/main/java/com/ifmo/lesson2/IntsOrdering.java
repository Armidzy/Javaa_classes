package com.ifmo.lesson2;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 3, b = 9, c = -1;

        String ordering = ordering(a, b, c);

        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        // TODO implement
        int mas[]= {a, b, c};
        int help;

        for (int i = 1; i < 3; i++) {  //ищем минимум и записываем его в 1 эл
            if (mas[i]<mas[0]) {
                help=mas[0];
                mas[0] = mas[i];
                mas[i]=help;

            }
        }
        for (int i = 0; i < 2; i++) {  //ищем максимум и записываем его в 3 эл
            if (mas[i]>mas[2]) {
                help=mas[2];
                mas[2] = mas[i];
                mas[i]=help;
            }
        }

        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
                "Возрастающая последовательность: " + mas[0] + ", " + mas[1] + ", " + mas[2];
    }
}
