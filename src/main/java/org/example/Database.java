package org.example;
import java.util.ArrayList;
public class Database {

    private ArrayList<Building> buildings;

    public Database() {
        this.buildings = new ArrayList<Building>();
    }

    public boolean addBuilding(Building building) {
        return this.buildings.add(building);
    }

    public Building getBuilding(String name) {
        for (Building building : this.buildings) {
            if (building.getBuildingName().equals(name)) {
                return building;
            }
        }
        System.out.println("Error: No building was found");
        return null;
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
