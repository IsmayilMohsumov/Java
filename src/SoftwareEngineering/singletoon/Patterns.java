package SoftwareEngineering.singletoon;

public class Patterns {

    public static void main(String[] args) {
        System.out.println("singleton");

        Logger obj1 = Logger.getIns();
        Logger obj2 = Logger.getIns();

//        System.out.println(" not singleton");
//        Patterns obj1= new Patterns();
//        Patterns obj2= new Patterns();
        
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
