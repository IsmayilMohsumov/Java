/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID.DependencyInversion;
//To achieve DI principle :

import java.util.ArrayList;
import java.util.List;

interface Developer {

    void develop();
}

class BackEndDeveloper2 implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("Java is writing by BAckEnd");
    }
}

class FrontEndDeveloper2 implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
        System.out.println("JavaScript is writing by FrontEnd...");
    }
}

public class CorrectWay {

    private List<Developer> developer = new ArrayList<Developer>();

    public CorrectWay(List<Developer> developers) {
        this.developer = developers;
    }

    public void implement() {
        for (Developer developer1 : developer) {
            developer1.develop();
        }
    }

    public static void main(String[] args) {
        List<Developer> developer = new ArrayList<Developer>();
        developer.add(new BackEndDeveloper2());
        CorrectWay correct = new CorrectWay(developer);
        correct.implement();
            
    }
}
