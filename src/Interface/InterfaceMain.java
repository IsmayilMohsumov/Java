/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.util.Vector;

 
public class InterfaceMain implements InterfaceMain2,Interface3 {

  
    public static void main(String[] args) {
    InterfaceMain in = new InterfaceMain();
    in.method();
    }

//    @Override
//    public void method() {
//        
//    }
    
    
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sur2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
    
}
