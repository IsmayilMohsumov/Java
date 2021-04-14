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
abstract class Phone {
    public Phone(){
        
    }
    int add(int a,int b){
        return a+b;
    }
    public String number;
    public abstract void call();
    public void camera (){
        System.out.println("taking photo ....");
    }
    public void repair(){
        System.out.println("Repairing a phone");
    }
}
