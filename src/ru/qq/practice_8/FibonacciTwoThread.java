package ru.qq.practice_8;

public class FibonacciTwoThread {
    private static long result;

    public static void getFibonacciNum(int n) {

        Thread sumThread = new Thread(() -> fibonacciFunc(n));

        Thread printThread = new Thread(() -> {
            try {
                sumThread.join();
                System.out.println("Res: " + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        printThread.start();

        sumThread.start();

    }

    private static void fibonacciFunc(int n){
        System.out.println("First thread started");
        if (n <= 1) {
            result = n;
        } else {
            long a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                long next = a + b;
                a = b;
                b = next;
            }
            result = b;
        }
        System.out.println("First thread ended");
    }
}
