package com.company;

/**
 * Created by andy on 20.11.2017.
 */
public class FactoyTestMain {

    public static void main(String[] args) {

        Factory factory = Factory.getFactory("de");
        Factory factory1 = Factory.getFactory("ru");
        Factory factory2 = Factory.getFactory("jp");

        Car car1 = factory.createCar();
        Car car2 = factory1.createCar();
        Car car3 = factory2.createCar();

        System.out.println("car1 can drive: " + car1.drive(340, 45) + " km");
        System.out.println("car2 can drive: " + car2.drive(450, 55) + " km");
        System.out.println("car3 can drive: " + car3.drive(100, 8) + " km");

    }

}
