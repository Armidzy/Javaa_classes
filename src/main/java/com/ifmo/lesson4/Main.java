package com.ifmo.lesson4;

public class Main {
    public static  void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println("Empty list");
        printlist(list, 3);

        list.add("row0");
        list.add("row1");
        list.add("row2");

        System.out.println("3 items in list");
        printlist(list, 3);

        System.out.println("1 item removed");
        Object removed = list.remove(2);
        System.out.println("Removed " + removed);
        printlist(list, 3);

    }

    private  static  void printlist(LinkedList list, int len){
        for (int i = 0; i < len; i++) {
            System.out.println(list.get(i));

        }
    }
}
