package com.company;

/**
 * Created by andy on 20.11.2017.
 */
public class Toyota implements Car {

    @Override
    public double drive(double distance, double fuel) {
        double consumption = 15;
        double range = fuel / consumption * 100;
        return (range > distance ? distance : range);
    }
}
