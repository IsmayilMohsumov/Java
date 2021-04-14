/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BankSystem;

/**
 *
 * @author Paris
 */
public class IdGenerate {
    private static int id=0;
    
    public static long generateId(){
        ++id;
        return id;
    }
    
}
