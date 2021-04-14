/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polymorphism;

/**
 *
 * @author Paris
 */
public class Animal {
        public void sound(){
            System.out.println("Animals make sounds");   
        }
 
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal doga = new Dog();
        a.sound();
        doga.sound();
        
    }
    
}
