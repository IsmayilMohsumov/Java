/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

interface Animal {

}

class Mammal implements Animal {

}

public class Dog extends Inheritance2.Dog {

    public int age = 10;

    public Dog() {
        System.out.println("Invoker");
        
    }
     public Dog(int age) {
     super(age,"s");
    }


    public void method() {
        System.out.println(super.age);
        System.out.println(super.name);
        super.sound("Hawk hawks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(12);
        System.out.println(dog.age);
        System.out.println(dog.name);
        dog.method();
            
//    Mammal m = new Mammal();
//    Dog dog = new Dog();
//    
//    dog.setM(m);
//        System.out.println(dog.getM());
//        System.out.println(dog instanceof Animal);        
//        System.out.println(m instanceof Animal);        
//        System.out.println(dog instanceof Mammal);        
    }
}
