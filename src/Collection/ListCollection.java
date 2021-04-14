/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import static Collection.ListCollection.LinkedList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author Paris
 */
public class ListCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Vector();
//        ArrayList();
        LinkedList();
    }

    public static void Vector() {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");

        System.out.println(v);
        v.add(1, "Indexli");
        System.out.println(v);

        v.ensureCapacity(22); //olcuyu genisletmek 
        v.clone(); // referancsi oldugu vectoru kopyaliyir ve Object qaytarir
        v.trimToSize();
        System.out.println(v.capacity());

        //retainAll() methodu iki collection arasinda eyni deyerleri saxlayir qalanlarini atir .
        Vector v2 = new Vector();
        v2.add("geeks");
//        v.retainAll(v2);
//        System.out.println(v);

        //listIterator() - (next() ve previous() metodlari var 
        System.out.println("-------------------------");
        ListIterator listr = v.listIterator();
        while (listr.hasNext()) {
            System.out.println(listr.next());
        }

        //Vector works both of them enumeration and iterator
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }

    public static void ArrayList() {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list 
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // forEach method of ArrayList and 
        // print numbers 
        Numbers.forEach((n) -> System.out.println(n));

        //listIterator() 
        ListIterator l = Numbers.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }

    }

    public static void LinkedList() {
        LinkedList<String> object = new LinkedList<String>();

        // Adding elements to the linked list 
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("Linked list : " + object);

        // Removing elements from the linked list 
        //removeFirst()
        //removeLast()
        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);

        // Finding elements in the linked list 
        boolean status = object.contains("E");

        if (status) {
            System.out.println("List contains the element 'E' ");
        } else {
            System.out.println("List doesn't contain the element 'E'");
        }

        // Number of elements in the linked list 
        int size = object.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list 
        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after change : " + object);
        
        //sort() 
        LinkedList object2 = new LinkedList();
        object2.add(1);
        object2.add(5);
        object2.add(4);
        object2.add(12);
        object2.add(21);
        object2.add(3);
        System.out.println(object2);
        object2.sort(Comparator.naturalOrder());
        System.out.println(object2);

    }

}
