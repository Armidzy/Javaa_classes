package com.ifmo.lesson10;

public class IntToStringTransformer implements  Transformer<Integer, String>{
    @Override
    public String transform(Integer integer) {
        return String.valueOf(integer);
    }
}
