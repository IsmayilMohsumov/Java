package LinkedinCourse.InputOutputReadingAndWriting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BufferedReaderExample {

    public static void main(String[] args) {
        File myObj = new File("C:/Users/Paris/Documents/NetBeansProjects/GettingReadyInterview/utilities/excel.xlsx");
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable :" + myObj.canRead());
        System.out.println("File size in bytes : " + myObj.length());
        try {
            BufferedReader bf = new BufferedReader(new FileReader(myObj));
            String line;
            while ((line = bf.readLine()) != null) {
                System.err.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
