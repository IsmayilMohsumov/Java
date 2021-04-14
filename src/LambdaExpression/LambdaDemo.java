/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LambdaExpression;

interface A {
    void show(int i);
//    void dontShow(String mesaj );
}
interface B {
    String apply ( String text1);
}

//class B implements A {
//    @Override
//    public void show(int i) {
//        System.out.println("Say hi from B");
//    }
//    
//}

public class LambdaDemo {

    public static void main(String[] args) {
//        A obj = new A() 
//        {
//            public void show(int i) {
//                System.out.println("HI from innner anonymous");
//            }
//        };
        
        A obj2 = new A() {
            public void show(int i) {
                System.out.println("Mesaj "+i);
            }
           
        };
        
        A obj3 = (i ) -> {
            System.out.println(""+i);
        };
        
         obj3.show(55);
         
         
         B inter = text1 ->  text1 +"";
        
         
         String get = inter.apply("hi");
         System.out.println(get);
    }
    
}
