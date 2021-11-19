package com.ifmo.lesson7;

public class Accumulator {
    private int value;
    private Operatoin op;

    public int getValue(){
        return  value;
    }

    public  void accumulate(int a){
        value = op.calculate(value, a);
    }

    public  Accumulator(int startValue, Operatoin op){
        this.value=startValue;
        this.op=op;
    }

    public  Accumulator(Operatoin op){
        this.value=0;
        this.op=op;
    }

    public void changeOperatoin(Operatoin op){
        this.op=op;
    }

}
