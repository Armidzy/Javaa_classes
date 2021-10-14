package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(evenArray[i]).append(" ");
        }
        System.out.println( sb.toString());

        for (int i = 0; i < 10; i++) {
            System.out.println(evenArray[i]);
        }

    }

    public static int[] evenArray() {
        int[] evenArray = new int[10];
        evenArray[0]=2;
        for (int i = 1; i < 10; i++) {
            evenArray[i]=evenArray[i-1]+2;
        }
        return evenArray;
    }
}
