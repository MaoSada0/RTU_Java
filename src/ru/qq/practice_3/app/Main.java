package ru.qq.practice_3.app;

import ru.qq.practice_3.vehicles.Car;
import ru.qq.practice_3.vehicles.ElectricCar;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("qq", 123, "Oil");
        ElectricCar electricCar = new ElectricCar("qq", 112, 52);

        System.out.println("car OwnerName:" + car.getOwnerName());
        System.out.println("car InsuranceNumber:" + car.getInsuranceNumber());
        System.out.println("car EngineType:" + car.getEngineType());

        System.out.println("____________");

        System.out.println("electric car OwnerName: " + electricCar.getOwnerName());
        System.out.println("electric car InsuranceNumber: " + electricCar.getInsuranceNumber());
        System.out.println("electric car EngineType: " + electricCar.getEngineType());
        System.out.println("electric car BatteryCapacity: " + electricCar.getBatteryCapacity());

    }


}
