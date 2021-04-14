/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collection;

import java.io.File;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class MapTable {

  
    public static void main(String[] args) {
//      hashMap();
        HashTable();
    }
    public static void hashMap() {
      HashMap<String, Integer> map 
            = new HashMap<>(); 
  
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        System.out.println("Size of map is:- "
                           + map.size()); 
  
        print(map); 
        if (map.containsKey("vishal")) { 
            Integer a = map.get("vishal"); 
            System.out.println("value for key"
                               + " \"vishal\" is:- "
                               + a); 
        } 
  
        map.clear(); 
        print(map); 
        
        System.out.println("--------------------------");
        
        
        
        //compute () 
       Map<String, Integer> map2 = new HashMap<>(); 
        map2.put("Key1", 12); 
        map2.put("Key2", 15); 
        
  
        // print map details 
        System.out.println("Map: " + map2); 
  
        // remap the values 
        // using compute method 
        map2.compute("Key1", (key, val) 
                                -> (val == null) 
                                       ? 1
                                       : val + 1); 
        map2.compute("Key2", (key, val) 
                                -> (val == null) 
                                       ? 1
                                       : val + 5); 
  
        // print new mapping 
        System.out.println("New Map: " + map2); 
        
        
        System.out.println("--------------------------");
        
        
        //entrySet()
              for (Map.Entry<String,Integer> entry : map2.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
    } 
    
    public static void HashTable(){
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101," ajay"); 
        ht.put(101,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
        
        
        System.out.println("-----------------------");
        Map<String, Integer> table = new Hashtable<>(); 
        table.put("Axe", 10); 
        table.put("Book", 500); 
        table.put("Clothes", 400); 
        table.put("Mobile", 5000); 
  
        // print map details 
        System.out.println("hashTable: "
                           + table.toString()); 
  
        // provide value for new key which is absent 
        // using computeIfAbsent method 
        table.computeIfAbsent("newPen", k -> 600); 
        table.computeIfAbsent("newBook", k -> 800); 
  
        // print new mapping 
        System.out.print("new hashTable: "); 
        print(table);
        
        
    }
  
    
    
    
    
    
    public static void print(Map <String, Integer> map) 
    { 
        if (map.isEmpty()) { 
            System.out.println("map is empty"); 
        } 
  
        else { 
            System.out.println(map); 
        } 
    } 
    }
    
    
