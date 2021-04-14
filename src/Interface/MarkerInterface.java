/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

interface Parking 
{}
class Vehicle{
    
} 
class Motor extends Vehicle{
}
class Car extends Vehicle implements Parking { }
class Moped extends Vehicle{
    
}

public class MarkerInterface {

    public static void main(String[] args) {
        Car car = new Car();
        Motor motor = new Motor();
        Moped moped = new Moped();
        check(car);
    }
    
    public static void check(Vehicle v){
        if(v instanceof Parking)System.out.println(v.getClass().getName()+" Allowed here ");
        else{
            System.out.println("Not");
        }
    }
    
    
    
}
