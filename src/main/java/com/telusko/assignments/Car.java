package com.telusko.assignments;

public class Car {

    private String carMake;
    private String carModel;
    private int carModelYear;

    public Car(String carMake, String carModel, int carModelYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carModelYear = carModelYear;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(int carModelYear) {
        this.carModelYear = carModelYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + carMake + '\'' +
                ", Model='" + carModel + '\'' +
                ", Model Year=" + carModelYear +
                '}';
    }
}
