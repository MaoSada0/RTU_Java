package ru.qq.practice_8.calculator;

import ru.qq.basicoperation.BasicOperation;
import ru.qq.numbersystemoperation.NumberSystemOperation;
import ru.qq.powoperation.PowOperation;
import ru.qq.tetrationoperation.TetrationOperation;

public class Calculator {
    public static double add(double a, double b) {
        return BasicOperation.add(a, b);
    }

    public static double subtract(double a, double b) {
        return BasicOperation.subtract(a, b);
    }

    public static double multiply(double a, double b) {
        return BasicOperation.multiply(a, b);
    }

    public static double divide(double a, double b) {
        return BasicOperation.divide(a, b);
    }

    public static double power(double a, int b) {
        return PowOperation.pow(a, b);
    }

    public static String toBinary(int num) {
        return NumberSystemOperation.toBinary(num);
    }

    public static String toHexadecimal(int num) {
        return NumberSystemOperation.toHex(num);
    }

    public static double tetrate(double a, int b) {
        return TetrationOperation.tetrate(a, b);
    }
}
