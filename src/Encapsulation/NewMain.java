/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Encapsulation;

/**
 *
 * @author Paris
 */
public class NewMain {

    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(19);
        per.setName("Isi");
        System.out.println("Adi :"+per.getName());
        System.out.println("Yashi :"+per.getAge());
    }
    
}
