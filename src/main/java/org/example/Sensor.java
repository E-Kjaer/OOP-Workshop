package org.example;

import java.util.ArrayList;

public class Sensor {
    private String name;
    private String type;
    private ArrayList<Float> history;

    public Sensor(String name, String type) {
        this.name = name;
        this.type = type;
        this.history = new ArrayList<Float>();
    }

    public float getValue() {
        return (float) Math.random() * 100;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Float> getHistory() {
        return history;
    }
}
