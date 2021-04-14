
package LinkedinCourse.InputOutput;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        
        String contents [] =new File(".").list();
        for (String string : contents) {
            System.out.println(string);
        }
        
        File myObj = new File("C:/Users/Paris/Documents/NetBeansProjects/GettingReadyInterview/src/LinkedinCourse/InputOutput/createFile2.txt");
        try{
        myObj.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
