/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedinCourse;

/*
 *Varargs means - Variable-length arguments
 */
public class Varargs {

    public static void main(String[] args) {
        String item = "Apple";
        String item2 = "Orange";
        String item3 = "Banana";
        String shopping[] = {"Bread", "Apple", "Pasta"};
        printShoppingList(item, item2);
        printShoppingList(shopping);
        
        
        printShoppingListByARGS(item3,item2);
        printShoppingListByARGS("Luggage","Sour","Fish");
        //varargs ile artiq ne array yaratmaga ehtiyac var nede bir bir oturmeye varargs ozu array yaradir. Obirsi metodlari artiq silmek olar.

    }

    private static void printShoppingList(String s1, String s2) {
        System.out.println("SHOPPING LIST:");
        System.out.println("1." + s1);
        System.out.println("2." + s2);
    }

    private static void printShoppingList(String s1, String s2, String s3) {
        System.out.println("SHOPPING LIST:");
        System.out.println("1." + s1);
        System.out.println("2." + s2);
        System.out.println("3." + s3);
    }

    private static void printShoppingList(String s1[]) {
        System.out.println("SHOPPING LIST:");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(i + 1 + "." + s1[i]);
        }
        System.out.println();
    }
    
     private static void printShoppingListByARGS(String... s1) {
        System.out.println("SHOPPING LIST:");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(i + 1 + "." + s1[i]);
        }
        System.out.println();
    }
}
