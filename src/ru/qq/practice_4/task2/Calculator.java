package ru.qq.practice_4.task2;

public class Calculator implements Mathematicae{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double inverse(double a) {
        return -a;
    }

    public double subtract(double a, double b){
        return add(a, inverse(b));
    }

    public double multiply(double a, double b) {
        double result = 0;
        boolean negative = false;

        if (b < 0) {
            b = inverse(b);
            negative = true;
        }

        for (int i = 0; i < b; i++) {
            result = add(result, a);
        }

        if (negative) {
            result = inverse(result);
        }

        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Devision by zero");
        }

        double result = 0;
        double absA = a < 0 ? inverse(a) : a;
        double absB = b < 0 ? inverse(b) : b;

        boolean negativeResult = (a < 0 && b > 0) || (a > 0 && b < 0);

        while (absA >= absB) {
            absA = subtract(absA, absB);
            result = add(result, 1);
        }

        return negativeResult ? inverse(result) : result;
    }

    public double mod(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Devision by zero");
        }

        double absA = a < 0 ? inverse(a) : a;
        double absB = b < 0 ? inverse(b) : b;

        while (absA >= absB) {
            absA = subtract(absA, absB);
        }

        return a < 0 ? inverse(absA) : absA;
    }
}
