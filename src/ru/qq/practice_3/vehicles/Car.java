package ru.qq.practice_3.vehicles;

public class Car {

    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    public Car(String ownerName, int insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public Car(String ownerName, int insuranceNumber) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ownerName='" + ownerName + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
