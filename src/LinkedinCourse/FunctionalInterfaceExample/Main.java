
package LinkedinCourse.FunctionalInterfaceExample;


public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name);
            }
        };
        gm.greet("Ismael");
        
        
        GreetingMessage gmByLambda =(name) -> {System.out.println("Hello 2"+name);};
        gmByLambda.greet("cuma");
        
        
        MessagePrinter printer = () ->{System.out.println("End of Code!");};
        printer.printMessage();
    }
}
