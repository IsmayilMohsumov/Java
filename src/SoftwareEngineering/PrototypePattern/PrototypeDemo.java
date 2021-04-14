package SoftwareEngineering.PrototypePattern;

import SOLID.OCP.Employee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Student Id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Student Name: ");
        String name = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Student surname: ");
        String surname = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Student mark: ");
        String mark = br.readLine();
        System.out.print("\n");
        
        StudentRecord s1 = new StudentRecord(id, name, surname, mark);
        
        s1.printInformationAboutStudent();
        System.out.println("\n");
        StudentRecord s2 =(StudentRecord) s1.getClone();
        System.out.println("Cloned Value --------------------------");
        s2.printInformationAboutStudent();

    }
}
