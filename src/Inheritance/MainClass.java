/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;
class Vehicle {
    
}
class Car extends Vehicle {

    public Car() {
        System.out.println("Car constructor");
    }
    
    public final void brake (){
        System.out.println("Car stopped");
    }
    
    protected void gas(){
        System.out.println("Qazlandim carda");
    }
}
public class MainClass extends Car{

    public MainClass() {
    super();
    }

    
    @Override
    protected void gas() {
        super.gas();
    }
    

    public static void main(String[] args) {
//       Car car = new Car();
//       car.brake();
        MainClass ma=new  MainClass();
//        ma.gas();
//        System.out.println(ma instanceof Vehicle);
        
        short shorte = 6;
        double inte = 6;
        byte b= 5;
        long l= 5;
        ma.write(shorte);
        ma.write( inte);
        ma.write((int)l);
    }
    
    public void write(short b){
        System.out.println("short");
    }
    public void write(double b){
        System.out.println("double");
    }
    
}
