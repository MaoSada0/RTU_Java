package ru.qq.practice_4.task1.secondWay;

import ru.qq.practice_4.task1.Movable;

public class Sheep extends Animal implements Movable {

    public Sheep(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this.age + 12;
    }

    @Override
    public void move() {
        System.out.println("Sheep moving");
    }
}
