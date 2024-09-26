package ru.qq.practice_4.task1.firstWay;

public class Dog extends Animal{
    public Dog(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this.age + 19;
    }

    @Override
    public void move() {
        System.out.println(this + "moving");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", size=" + size +
                '}';
    }
}
