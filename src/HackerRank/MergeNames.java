/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MergeNames {

   
   public static String[] uniqueNames(String[] names1, String[] names2) {
      Set<String> list = new HashSet<>();
       for (int i = 0; i < names1.length; i++) {
           list.add(names1[i]);
       }
         for (int i = 0; i < names2.length; i++) {
           list.add(names2[i]);
       }
         
        String returnArray[] = new String[list.size()];
        list.toArray(returnArray);
        System.out.println(list);
       return returnArray;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println( MergeNames.uniqueNames(names1, names2)); // should print Ava, Emma, Olivia, Sophia
    }
    
}
