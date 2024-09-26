package ru.qq.practice_4.temp;

abstract class QuadraticEquation {
    protected double a;
    protected double b;
    protected double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Abstract method to solve the quadratic equation
    public abstract void solve();
}
