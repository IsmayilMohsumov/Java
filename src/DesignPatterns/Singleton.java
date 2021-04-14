/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPatterns;

class ABS
{
    static ABS obj = new ABS();
    private ABS(){
        
    }
    public static ABS getInstance(){
           return obj;
    }
    
}
public class Singleton {


    public static void main(String[] args) {
       
        ABS obj = ABS.getInstance();
        ABS obj2 = ABS.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
        
    
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
}
