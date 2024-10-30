package ru.qq.practice_9;

public class Main {
    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        convertor.createVal(Boolean.class, true);

        convertor.binaryAnd(false);
        convertor.printValue();
    }
}
