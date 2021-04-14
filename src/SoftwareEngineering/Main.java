/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SoftwareEngineering;

/**
 *
 * @author Paris
 */
public class Main {
    public static void main(String[] args) {
        Student anar = new Student();
        anar.setName("Anar");
        anar.setSurname("Mohs");
        anar.setAge(22);
        anar.setRegistrationId(1);
        Class cl = new Class("5");
        anar.setCourse(cl);
        anar.displayInformation();
    }
}
