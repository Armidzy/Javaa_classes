package com.ifmo.lesson10;

public class TransformerMain {
    public static void main(String[] args) {
        Integer input = 10;
        Transformer<Integer, String> transformer = new IntToStringTransformer();

        String output = transformer.transform(input);

        System.out.println(output);
    }
}
