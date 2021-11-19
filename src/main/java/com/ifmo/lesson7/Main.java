package com.ifmo.lesson7;

public class Main {

    public  static void main(String args[]) {
        Accumulator acc = new Accumulator(0, new Plus()); //new minis()  1,new multiply()
        acc.accumulate(2);
        acc.accumulate(5);
        int val = acc.getValue(); //  7
        System.out.println(val);

        Accumulator acc2 = new Accumulator(0, new Minus());
        acc2.accumulate(2);
        acc2.accumulate(5);
        val = acc2.getValue(); // -7
        System.out.println(val);

        Accumulator acc3 = new Accumulator(1, new Multiply());
        acc3.accumulate(2);
        acc3.accumulate(5);
        val = acc3.getValue(); //  10
        System.out.println(val);

        acc3.changeOperatoin(new Minus());
        acc3.accumulate(5);
        val = acc3.getValue(); //  10
        System.out.println(val);
    }
}
