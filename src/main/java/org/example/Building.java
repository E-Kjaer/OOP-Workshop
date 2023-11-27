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
        for (int i = 0; i < this.sensors.size(); i++) {
            if (sensors.get(i).getName().equals(name)) {
                sensors.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removeActuator(String name) {
        for (int i = 0; i < this.actuators.size(); i++) {
            if (actuators.get(i).getName().equals(name)) {
                actuators.remove(i);
                return true;
            }
        }
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

    public String toString() {
        return "Name: " + this.buildingName + "\n" +
                "Sensors: " + printSensors() + "\n" +
                "Actuators: " + printActuators();
    }

    private String printActuators() {
        String result = "";
        for (Actuator actuator : this.actuators) {
            result += actuator.getName() + "\n";
        }
        return result;
    }

    private String printSensors() {
        String result = "";
        for (Sensor sensor : this.sensors) {
            result += sensor.getName() + "\n";
        }
        return result;
    }

}
