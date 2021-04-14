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
public class RepairShop   {


    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        repairPhone(iphone);
    }
    
    public static void repairPhone (Phone p){
         p.repair();
    }

}
