package org.example;

public class Actuator {
    private float setPoint;
    private String name;
    private String type;
    private Sensor sensor;

    public Actuator(float setPoint, String name, String type, Sensor sensor) {
        this.setPoint = setPoint;
        this.name = name;
        this.type = type;
        this.sensor = sensor;
    }

    public float getSetPoint() {
        return setPoint;
    }

    public void setSetPoint(float setPoint) {
        this.setPoint = setPoint;
    }

    public boolean checkValue() {
        return sensor.getValue() > this.setPoint;
    }

    public boolean equals(String name) {
        return this.name.equals(name);
    }
}
