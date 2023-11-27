package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Building building = new Building("building#1");
        Sensor sensor = new Sensor("Temp room 1", "Temperature");
        Actuator actuator = new Actuator(37.0f, "Regulator", "Temperature", sensor);

        building.addSensor(sensor);
        building.addActuator(actuator);
        database.addBuilding(building);

        database.printBuildings();
        Building b = database.getBuilding("building#1");
        System.out.println(b);
        b.removeActuator("Regulator");
        System.out.println(b);
        b.removeSensor("Temp room 1");
        System.out.println(b);
    }
}