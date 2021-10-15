package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            sb.append(unevenArray[i]).append(" ");
        }
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder();
        for (int i = 49; i >= 0; i--) {
            sb2.append(unevenArray[i]).append(" ");
        }
        System.out.println(sb2.toString());

    }

    public static int[] unevenArray() {
        // TODO implement
        int[] arr = new int[50];
        arr[0]=1;
        for (int i = 1; i < 50; i++) {
            arr[i]=arr[i-1]+2;
        }
        return arr;
    }
}
