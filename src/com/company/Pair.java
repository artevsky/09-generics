package com.company;

// Создать класс Pair, параметризованный двумя параметрами K и V.
// Класс должен хранить две переменные типов K и V соответственно.
// У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.

public class Pair<K, V> {
    K key;
    V value;

    public Pair() {
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
