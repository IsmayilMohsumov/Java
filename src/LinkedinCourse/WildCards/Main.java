package LinkedinCourse.WildCards;

import java.util.ArrayList;
import java.util.List;

/*
 Wildcards in Java can be useful in a variety of different situations.
 A wildcard is essentially an unknown type, and can give you more flexibility when writing methods. 
 */
public class Main {

    public static void main(String[] args) {

        //Lsit of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        //List of offices 
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());

        /* When I try and do this, I get a compile time error. 
         *One solution would be to create a new method for each different subtype of building.
         */
        // printBuildings(offices);
        //But a quicker and simpler solution is to use wildcards 
        printBuildingsByWildcards(buildings);

        //List of Houses 
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
//        printBuildings(houses);
        printBuildingsByWildcards(buildings);

        addHouseToList(houses);
//      addHouseToList(buildings); usage of wildcards in outvariable
        addHouseToListByWildcards(buildings);

    }

    static void printBuildings(List<Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    static void printBuildingsByWildcards(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    static void addHouseToList(List<House> buildings) {
        buildings.add(new House());
        System.out.println();
    }

    static void addHouseToListByWildcards(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }

    /*If you are unsure about when to use extends and when to use super with wildcards, you can think about invariables and outvariables.
     *In the printBuildings method, I am passing in a list which provides data which I use inside the method, so this in an invariable. 
     *With invariables,it makes sense to use extends. In the addHouseToList method, I am using the method to give additional data by adding to the list. 
     *So this is an outvariable.
     */
}
