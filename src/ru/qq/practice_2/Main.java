package ru.qq.practice_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Bmw", "Some license", "Black", 2015);
        Car car3 = new Car("Toyota", "Red");

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);

        System.out.println("car1 age: " + car1.getAgeOfCar());
        System.out.println("car2 age: " + car2.getAgeOfCar());
        System.out.println("car3 age: " + car3.getAgeOfCar());

    }

}
