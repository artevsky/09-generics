package com.company;
// Дан класс Solution, параметризированный T.
// Ограничьте параметр T.
// T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics.
// Менять можно только класс Solution

public class Solution<T extends ClassForGenerics> implements InterfaceForGenerics<T> {
    T variable;

    public Solution(T variable) {
        this.variable = variable;
    }
}
