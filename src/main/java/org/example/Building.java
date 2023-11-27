package org.example;

import java.util.ArrayList;

public class Building {
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<Actuator>();
    private String buildingName;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }
    public boolean addSensor(Sensor sensor) {
        if (sensor != null){
            sensors.add(sensor);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addActuator(Actuator actuator ) {
        if (actuator != null) {
            actuators.add(actuator);
            return true;
        }
        else {
            return false;
        }
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

    public String getBuildingName() {
        return buildingName;
    }

    public boolean equals(String name) {
        return this.buildingName.equals(name);
    }

}
