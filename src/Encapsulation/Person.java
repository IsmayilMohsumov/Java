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
public class Person {
    private String name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()&&name!=null&name.length()>2)
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18 && age < 90){
        this.age = age;
        }else{
            System.out.println("Yaş keçərli deyil");
        }
    }
    
    
    
}
