package LinkedinCourse.FunctionalInterfaceExample;

//A functional interface is an interface that has only one abstract method. 
@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
    
    //Bashqa bir method elave etmek istesek compile error alaciyiq
//    public abstract void sayBye(String name);
    
}
