package com.company;

/**
 * Created by andy on 20.11.2017.
 */
public class GermanFactory extends Factory {
    @Override
    Car createCar() {
        return new BMW();
    }
}