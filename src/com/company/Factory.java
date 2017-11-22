package com.company;

/**
 * Created by andy on 20.11.2017.
 */
public abstract class Factory {
    private static Factory jpFactory;
    private static Factory ruFactory;
    private static Factory deFactory;

    public static Factory getFactory(String region) {
        if (region.toLowerCase().equals("ru")) {
            if (ruFactory == null) {
                ruFactory = new RusFactory();
            }
            return ruFactory;
        } else if (region.toLowerCase().equals("de")) {
            if (deFactory == null) {
                deFactory = new GermanFactory();
            }
            return deFactory;
        } else if (region.toLowerCase().equals("jp")) {
            if (jpFactory == null) {
                jpFactory = new JapanFactory();
            }
            return jpFactory;
        }
        throw new RuntimeException("Selection is not property: " + region);
    }

    abstract Car createCar();
}
