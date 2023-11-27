package org.example;

import java.util.ArrayList;

public class Building {
    ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    ArrayList<Actuator> actuators = new ArrayList<Actuator>();
    String buildingName;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }
    public boolean addSensor(Sensor) {
        return false;
    }

    public boolean addActuator(Actuator) {
        return false;
    }

    public boolean removeSensor(String name) {
        return false;
    }

    public boolean removeActuator(String name) {
        return false;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuator() {
        return actuators;
    }

}
