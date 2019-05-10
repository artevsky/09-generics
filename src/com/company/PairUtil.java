package com.company;

//Создать статический обобщённый метод swap в final классе PairUtil.
// Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.

public final class PairUtil {
    public static <K, V> Pair swap(Pair pair) {
        Pair pair1 = new Pair();
        pair1.key = pair.value;
        pair1.value = pair.key;
        return pair1;
    }
}
