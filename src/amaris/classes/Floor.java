package amaris.classes;

import java.util.ArrayList;

public class Floor {

    Building building;
    ArrayList<Room> rooms;

    public Floor (Building edificio, ArrayList<Room> habitaciones) {
        this.building = edificio;
        this.rooms = habitaciones;
    }

    public void addRoomFelizucco(Room room) {
        this.rooms.add(room);
    }

    public int getAreaFelizucco() {
        int area = 0;

        for(int i = 0; i < rooms.size(); i++) {
            area = area + this.rooms.get(i).getAreaFelizucco();
        }

        return area;
    }
}
