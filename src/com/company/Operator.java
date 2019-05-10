package com.company;

// Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных, используя параметризацию классов.

public class Operator <A extends Number, B extends Number>{

    A a;
    B b;

    public Operator(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public double add(){
        if(a instanceof Integer && b instanceof Integer) {
            return (a.intValue() + b.intValue());
        } else return (a.doubleValue() + b.doubleValue());
    }

    public double multiply(){
        if(a instanceof Integer && b instanceof Integer) {
            return (a.intValue() * b.intValue());
        } else return (a.doubleValue() * b.doubleValue());
    }

}
