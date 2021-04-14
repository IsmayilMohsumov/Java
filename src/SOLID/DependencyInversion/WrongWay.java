package SOLID.DependencyInversion;

import java.util.ArrayList;
import java.util.List;

class BackEndDeveloper {

    public void writeJava() {

    }
}

class FrontEndDeveloper {

    public void writeJavascript() {

    }
}

 class Project {

     
    private BackEndDeveloper backEnd = new BackEndDeveloper();
    private FrontEndDeveloper frontEnd = new FrontEndDeveloper();

    public void implement() {
        backEnd.writeJava();
        frontEnd.writeJavascript();
    }
     /*
     So as we can see the Project class is a high level module and it depends on low level modules such as BackEndDeveloper and FrontEndDeveloper.
     We are actually violating the first part of the dependency inversion principle.
     */

}






