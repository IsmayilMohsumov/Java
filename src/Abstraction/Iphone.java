/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstraction;

/**
 *
 * @author Paris
 */
public class Iphone extends Phone{

    @Override
    public void call() {
        System.out.println("Calling by Iphone");
    }

    @Override
    int add(int a, int b) {
        return super.add(a, b); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void repair() {
        System.out.println("Iphone is repairing"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void camera() {
        System.out.println("Iphone is taking photo");
    }
    
}
