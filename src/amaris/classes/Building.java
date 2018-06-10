package amaris.classes;

import java.util.ArrayList;

public class Building {

    String buildingName;
    ArrayList<Floor> floors;

    public Building(String nombre) {
        this.buildingName =nombre;
    }

    public Building(String nombre, ArrayList<Floor> plantas) {
        this.buildingName = nombre;
        this.floors = plantas;
    }

    public void addAllFloorsFelizucco(ArrayList<Floor> plantas) {
        this.floors = plantas;
    }

    public void addFloorFelizucco(Floor floor){
        this.floors.add(floor);
    }

    public int getTotalAreaFelizucco() {
        int totalArea = 0;

        for (int i = 0; i < floors.size(); i++) {
            totalArea = totalArea + this.floors.get(i).getAreaFelizucco();
        }

        return totalArea;
    }
}
