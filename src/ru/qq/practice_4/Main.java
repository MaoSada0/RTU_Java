package ru.qq.practice_4;
import ru.qq.practice_4.task2.Calculator;

public class Main {
    public static void main(String[] args) {
        // Вариант 2
        Calculator c = new Calculator();
        System.out.println(c.mod(-117, 100));
        System.out.println(c.mod(117.5, 100));
        System.out.println(c.add(1, 2));
        System.out.println(c.subtract(10, 2));
        System.out.println(c.divide(10, 2.5));
        System.out.println(c.multiply(2.3, 6));
    }
}
