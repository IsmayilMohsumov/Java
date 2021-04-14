

package LinkedinCourse.Substution_Principle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);  // here is the Substution principle.
        
        
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);
        
         List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        
        /*So the substitution principle does not apply here. 
        *The substitution principle lets you assign variables of a given type to the subtype 
        *but the principle does not apply with types of lists.
        *But we can change this behaviour using wildcards.
        */
        
        //        printBuildings(offices);  
        
        
    }
    static void build(Building building){
        System.out.println("Constructing new "+building.toString());
    }
    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i+1+":"+buildings.get(i).toString());
        }
    }
   
}
