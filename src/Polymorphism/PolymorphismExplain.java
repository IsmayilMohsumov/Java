/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

class Animall {

    private String name;

    public Animall(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal speaks....");
    }
}

class Dogg extends Animall {

    public Dogg(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Haw haw...");
    }
}

class Bird extends Animall {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Chuk chuk..."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class PolymorphismExplain {

    public static void main(String[] args) {
        Animall animal = new Animall("Animals");
        Dogg dog = new Dogg("Alabash");
        Bird bird = new Bird("Maria");
        speakTry(dog);
    }

    public static void speakTry(Animall animals) {
        animals.speak();
    }

}
