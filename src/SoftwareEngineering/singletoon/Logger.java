/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SoftwareEngineering.singletoon;


public class Logger {
    private static Logger logger;
    private Logger (){
        
    }
    
    public static Logger getIns(){
        if(logger == null){
            logger = new Logger();
        }return logger;
    }
}
