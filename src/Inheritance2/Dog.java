/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance2;

/**
 *
 * @author Paris
 */
public class Dog {
    public int age = 20;
    public String name = "Alabash";

    public Dog() {
        System.out.println("Constructor invoked");
    }

   public Dog(int age , String name) {
        System.out.println("gelen : "+age +"" + name);
        
    }
    
    
    public void sound(){
        System.out.println("Haw hawk");
    }
    public void sound(String name ){
        System.out.println("Dog says:"+name);
    }
    {
        System.out.println("Static blocks");
    }
}
