package com.ifmo.lesson2;

public class FloatRound {
    /*
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */
    public static void main(String[] args) {
        float n = -12.5F;

        float rounded = round(n);

        System.out.println(rounded);
    }

    public static float round(float n) {
        float remainder = n % 1;
        if (remainder < 0)
            remainder *= -1;
        int rounded;
        //System.out.println(remainder);
        if (n>0) {
            if (remainder >= 0.5F)
                rounded = (int) n + 1;
            else
                rounded = (int) n;
        }
        else{
            if (remainder >= 0.5F)
                rounded = (int) n - 1;
            else
                rounded = (int) n;
        }
        return rounded;
    }
}
