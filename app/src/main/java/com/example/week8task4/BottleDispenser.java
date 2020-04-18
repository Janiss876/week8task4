package com.example.week8task4;

import android.widget.TextView;

import java.util.ArrayList;

public class BottleDispenser {

    private static BottleDispenser bd = new BottleDispenser();

    private ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
    private float money;

    private BottleDispenser() {
        money = 0;
        bottle_array.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 0.5, 1.8));
        bottle_array.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 1.5, 2.2));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 0.5, 2.0));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 1.5, 2.5));
        bottle_array.add(new Bottle("Fanta Zero", "Fanta", 0.3, 0.5, 1.95));
        bottle_array.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 0.5, 1.8));
        bottle_array.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 1.5, 2.2));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 0.5, 2.0));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 1.5, 2.5));
        bottle_array.add(new Bottle("Fanta Zero", "Fanta", 0.3, 0.5, 1.95));
    }

    public static BottleDispenser getInstance() {
        return bd;
    }

    public void addMoney(TextView f, double m) {
        money += m;
        f.setText("Added " + m + "€!");

    }

    public void buyBottle(String b, TextView f) {
        String name = b.substring(0, b.indexOf(","));
        String remainder = b.substring(name.length()+2);
        double volume = Double.parseDouble(remainder.substring(0, remainder.indexOf(",")));
        for (int i = 0; i < bottle_array.size(); i++) {
            if (name.equals(bottle_array.get(i).getName()) & bottle_array.get(i).getVolume() == volume) {
                if (money < bottle_array.get(i).getPrice()) {
                    f.setText("Add money first!");
                    return;
                } else {
                    money -= bottle_array.get(i).getPrice();
                    f.setText(bottle_array.get(i).getName() + " " + bottle_array.get(i).getVolume() + " came out of the dispenser!");
                    bottle_array.remove(i);
                    return;
                }
            } else {
                if (i == bottle_array.size() - 1) {
                    f.setText("There are no bottles!");
                }
            }
        }

    }

    public void returnMoney(TextView f) {
        f.setText("You got " + money + "€ back!");
        money = 0;

    }

}