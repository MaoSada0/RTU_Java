package ru.qq.practice_3.vehicles;

public class ElectricCar extends Car{

    private int batteryCapacity;


    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric"; // демонстрация protected
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }



    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
