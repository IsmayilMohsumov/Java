/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedinCourse;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paris
 */
public class GenericsMethods {

    static Integer[] intArray = {1, 2, 3, 532, 123};
    static Character[] charArray = {'s','w','2'};
    
    public static List arrayToListWrongWay(Object[] array,List<Object> list){
        for (Object object  : array){
            list.add(object);
        }
        return list;
    }
    
    public static <T> List<T>  arrayToListCorrectWay(T[] array,List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }
    
    public static void main(String[] args) {
        
        //Generic methodsuz!
        List<Character> charList = arrayToListWrongWay(charArray,new ArrayList<>());
        List<Integer> intList = arrayToListWrongWay(intArray,new ArrayList<>());
        
//      List<String> intList = arrayToListWrongWay(intArray,new ArrayList<>()); 
        //bu halda hecbir compile error olmur amma run etdikde exception alinir  java.lang.ClassCastException
        
        System.out.println(intList.get(0));
        
        
        
        //Generic Method ile 
        
        List<Character> charList2 = arrayToListCorrectWay(charArray,new ArrayList<>());
        List<Integer> intList2 = arrayToListWrongWay(intArray,new ArrayList<>());
        
//      List<String> intList2 = arrayToListCorrectWay(intArray,new ArrayList<>()); 
        //compile error aliriq bu halda more flexible and exceptionu daha tez discover etmek olur
        
        System.out.println(intList2.get(0));
        
    }
}
