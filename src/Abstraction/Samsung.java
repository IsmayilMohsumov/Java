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
public class Samsung extends Phone{
 @Override
    public void call() {
        System.out.println("Calling by Iphone");
    }

    @Override
    public void repair() {
        System.out.println("Samsung is repairing"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void camera() {
        System.out.println("Samsung is taking photo");
    }
}
