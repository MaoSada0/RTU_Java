package ru.qq.tetrationoperation;

import java.util.stream.IntStream;

public class TetrationOperation {

    public static double tetrate(double a, int b) {
        if (b < 1) {
            throw new IllegalArgumentException("b must be > 0");
        }

        return IntStream.range(1, b)
                .mapToDouble(i -> a)
                .reduce(a, (res, base) -> Math.pow(base, res));
    }
}
