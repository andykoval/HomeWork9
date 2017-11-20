package com.company;

/**
 * Created by andy on 20.11.2017.
 */
public class BMW implements Car {

    @Override
    public double drive(double distance, double fuel) {
        double consumption = 18;
        double range = fuel / consumption * 100;
        return (range > distance ? distance : range);
    }
}
