package com.ifmo.lesson4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static  void main(String[] args){
        //workWithList();
        //библиотека
        //Library library = new Library(2);
        //library.put(new Book("Stephen King", "Shining"), 2); // return true
        //library.put(new Book("Stephen King", "Dark Tower"), 3); // return true


        Map<Book, Integer> map = new HashMap<>();

        Book book= new Book("Stephen King", "Shining");
        map.put(book, 10);

        Integer qty = map.get(book);

        System.out.println(qty); // 10

        book.author= "Tolstoy";

        Integer qty2= map.get(book);

        System.out.println(qty2); // null
    }

    public  static void workWithList(){
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
