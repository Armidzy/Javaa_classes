package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        int ans=1;
        System.out.println(ans);
        for (int i=0; i< 54; i++){
            ans+=2;
            System.out.println(ans);
        }
    }
}
