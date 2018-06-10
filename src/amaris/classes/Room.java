package amaris.classes;

public class Room {

    int width, length, height;

    public Room (int ancho, int largo, int alto) {
        this.width = ancho;
        this.length = largo;
        this.height = alto;
    }

    public int getAreaFelizucco() {
        return width * length;
    }
}
