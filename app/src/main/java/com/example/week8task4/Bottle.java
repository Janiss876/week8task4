package com.example.week8task4;

public class Bottle {

    private String name;
    private String manufacturer;
    private double total_energy;
    private double volume;
    private double price;


    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        volume = 0.5;
        price = 1.80;
    }

    public Bottle(String bName, String manuf, double totE, double bVol, double bPrice){
        name = bName;
        manufacturer = manuf;
        total_energy = totE;
        volume = bVol;
        price = bPrice;
    }

    public String getName(){
        return name;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getEnergy(){
        return total_energy;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }
}
