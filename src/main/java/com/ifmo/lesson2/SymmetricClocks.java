package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int count=0;
        for (int i = 0; i <= 23; i++) {   //часы
            for (int j = 0; j <= 59; j++) { //минуты
                String str1;
                String str2;

                if (i < 10)
                    str1=reverseString("0" + Integer.toString(i));
                else
                    str1=reverseString(Integer.toString(i));
                if (j< 10)
                    str2="0" + Integer.toString(j);
                else
                    str2=Integer.toString(j);

                if (str1.equals(str2)) {
                    count++;
                    System.out.println(i + "  " + j);
                }
            }
        }

        return count;
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
