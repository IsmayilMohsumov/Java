/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CleanCode;

import java.util.logging.Logger;

public class CleanCodeExamples {
    static CleanCodeExamples cObj = new CleanCodeExamples();
    private String name;
    private Integer age;
    private final int MAX_AGE = 40;
    private final int MIN_AGE = 18;
    private CleanCodeExamples (){
        
    }
    public static  CleanCodeExamples of(){
        return cObj;
    }
    
    public static void main(String[] args) {
        CleanCodeExamples cleanObj = fillUser("ismayil", 19);
        CleanCodeExamples cleanObj2 = fillUser("ismayil", 19);
        cleanObj.addUser(cleanObj);
    }

    public static CleanCodeExamples fillUser(String name, Integer age) {
        CleanCodeExamples cleanObj = CleanCodeExamples.of();
        cleanObj.name = name;
        cleanObj.age = age;
        return cleanObj;
    }

    public void addUser(CleanCodeExamples c) {
        if (c.age > MAX_AGE || c.age < MIN_AGE) {
            System.out.println("Invalid age");
        } else {
            System.out.println("Success!");
        }
    }

}
