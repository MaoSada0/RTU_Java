package ru.qq.practice_6;

public class Main {
    public static void main(String[] args) {
        // вариант 1

        int num = 1111;

        try {
            System.out.println(num + ": " + Convertor.convertNumberToText(num));
        } catch (InvalidNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
