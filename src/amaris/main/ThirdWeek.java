/** By Felipe P.
 *  Date: 2018-4-20
 */

package amaris.main;

import java.util.ArrayList;
import amaris.classes.Building;
import amaris.classes.Floor;
import amaris.classes.Room;

public class ThirdWeek {

    public static void main (String[] args) {
        Building myBuilding = new Building("Hilton");

        Room myRoom1 = new Room(20,20,20);
        Room myRoom2 = new Room(30,40,60);

        ArrayList<Room> allRooms = new ArrayList<>();
        allRooms.add(myRoom1);
        allRooms.add(myRoom2);

        Floor myFloor1 = new Floor (myBuilding,allRooms);
        Floor myFloor2 = new Floor (myBuilding,allRooms);
        Floor myFloor3 = new Floor (myBuilding,allRooms);
        ArrayList<Floor> allFloors = new ArrayList<>();
        allFloors.add(myFloor1);
        allFloors.add(myFloor2);
        allFloors.add(myFloor3);

        myBuilding.addAllFloorsFelizucco(allFloors);

        System.out.print("Hello");
        System.out.print("Total area of the building is:");
        System.out.print(myBuilding.getTotalAreaFelizucco());
    }
}
