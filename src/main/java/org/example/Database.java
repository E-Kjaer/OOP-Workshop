package org.example;
import java.util.ArrayList;
public class Database {

    private ArrayList<Building> buildings;

    public boolean addBuilding(Building building) {
        this.buildings.add(building);
        return true;
    }

    public boolean removeBuilding(String building) {
        this.buildings.remove(building);
        return true;
    }

    public void printBuildings() {
        for (Building building : this.buildings) {
            System.out.println(building);
        }
    }

    public ArrayList<Building> getBuildings() {
        return this.buildings;
    }
}
