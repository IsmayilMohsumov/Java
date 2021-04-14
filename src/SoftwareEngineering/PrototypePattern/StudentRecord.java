package SoftwareEngineering.PrototypePattern;

import java.util.stream.Stream;

 enum Marks{
    GOOD("5"),NORMAL("4"),BAD("3");
    
    private String mark;
         // The constructor must be privatized to ensure that it is not created by the external object
    private Marks(String mark){
        this.mark = mark;
    }
    
         // access the corresponding value
    public String getValue(){
        return mark;
        
       
    }
    
     public static Stream<Marks> stream() {
        return Stream.of(Marks.values()); 
    }

}

public class StudentRecord implements Prototype{
    private int id;
    private String name,surname;
    private Marks mark;
    
    public void printInformationAboutStudent() {
        System.out.println("\t"+name + " " + surname);
        System.out.println("\t"+" ID number: " + id);
        System.out.println("\t"+" Mark: " + mark);
    }
    public static void main(String[] args) {
        
    }

    public StudentRecord(int id, String name, String surname, String mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mark=Marks.stream().filter(d -> d.getValue().equals(mark)).findFirst().get();
    }

    @Override
    public Prototype getClone() {
        return new StudentRecord(id, name, surname, mark.getValue());
    }
    
    
    
}
