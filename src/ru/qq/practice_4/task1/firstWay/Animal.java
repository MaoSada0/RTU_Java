package ru.qq.practice_4.task1.firstWay;

import ru.qq.practice_4.task1.Movable;

abstract public class Animal implements Movable {
    protected int age;
    int size;

    public Animal(int age, int size) {
        this.age = age;
        this.size = size;
    }

    abstract public void move();

    public abstract int toHumanAge();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
