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
        float value = (float) Math.random() * 100;
        this.history.add(value);
        return value;
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

    public boolean equals(String name) {
        return this.name.equals(name);
    }
}
