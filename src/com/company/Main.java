package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(PairUtil.swap(new Pair(1, "Hello")).key + " " + PairUtil.swap(new Pair(1, "Hello")).value);

        Operator op = new Operator(3.3, 2);
        System.out.println(op.add());
        System.out.println(op.multiply());
    }
}
