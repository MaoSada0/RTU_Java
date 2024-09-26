package ru.qq.practice_4.task1.secondWay;

import ru.qq.practice_4.task1.Movable;

public class Dog extends Animal implements Movable {
    public Dog(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this.age + 19;
    }

    @Override
    public void move() {
        System.out.println("Dog move!");
    }


}
