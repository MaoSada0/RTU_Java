package ru.qq.practice_4.task1.secondWay;

abstract public class Animal {
    int age;
    int size;

    public Animal(int age, int size) {
        this.age = age;
        this.size = size;
    }

    abstract public int toHumanAge();

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
