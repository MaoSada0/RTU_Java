package ru.qq.practice_4.task1.firstWay;

public class Sheep extends Animal{

    public Sheep(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this.age + 12;
    }

    @Override
    public void move() {
        System.out.println(this + "moving");
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", size=" + size +
                '}';
    }
}
