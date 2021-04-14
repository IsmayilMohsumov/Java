/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

public class StringTest {

     public static void concat1(String s1) 
    { 
        s1 = s1 + "forgeeks"; 
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("forgeeks"); 
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("forgeeks"); 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "Geeks"; 
        concat1(s1);  // s1 is not changed 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Geeks"); 
        concat2(s2); // s2 is changed 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer("Geeks"); 
        concat3(s3); // s3 is changed 
        System.out.println("StringBuffer: " + s3); 
    } 
    
    
    
    public static void compares(){
        String s1 = "Ram"; 
        String s2 = "Ram"; 
        String s3 = new String("Ram"); 
        String s4 = new String("Ram"); 
        String s5 = "Shyam"; 
        String nulls1 = null; 
        String nulls2 = null; 
  
        System.out.println(" Comparing strings with equals:"); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.equals(s5)); 
        // System.out.println(nulls1.equals(nulls2));  // NullPointerException 
  
        System.out.println(" Comparing strings with ==:"); 
        System.out.println(s1 == s2); 
        System.out.println(s1 == s3); 
        System.out.println(s3 == s4); 
        System.out.println(nulls1 == nulls2); 
  
        System.out.println(" Comparing strings with compareto:"); 
        System.out.println(s1.compareTo(s3)); 
        System.out.println(s1.compareTo(s5)); 
        // System.out.println(nulls1.compareTo(nulls2));  // NullPointerException
    }
    
}
