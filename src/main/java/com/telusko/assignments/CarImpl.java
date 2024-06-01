package com.telusko.assignments;

public class CarImpl {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "Altima", 2024);
        System.out.println(car1);

        Car car2 = new Car("Toyota", "Highlander", 2022);
        System.out.println(car2);

        Car car3 = new Car("Tesla", "Model Y", 2023);
        System.out.println(car3);

        Car car4 = new Car("Honda", "CRV", 2024);
        System.out.println(car4);

        Car car5 = new Car("BMW", "X3", 2024);
        System.out.println(car5);
    }
}