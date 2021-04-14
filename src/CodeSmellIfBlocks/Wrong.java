/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeSmellIfBlocks;

 enum DatabaseType{
   OORACLE,MYSQL,PHPMYADMIN
  }   


class Person{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
}

class PersonDAO{
    DatabaseType databaseType;

    public PersonDAO(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }
    
    public void add (Person person){
        if(DatabaseType.OORACLE==databaseType){
            System.out.println("Person added to Oracle Database!");
        }else if(DatabaseType.MYSQL==databaseType){
                System.out.println("Person added to MYSQL Database!");
        }else{
                System.out.println("Person added to PHPMYADMIN Database!");
        }
    }
    
}

class PersonValidation{
    public static boolean userExists(PersonDTO person) {
        return true;
    }
}
public class Wrong {
    public static void main(String[] args) {
        PersonDAO dao = new PersonDAO(DatabaseType.MYSQL);
        dao.add(new Person("Isi","Mohsumov"));
    }
    
}

/*                              SUMMARY
CODE SMELL:
IF else ,else if,else -----46 -> 52 if we had more than 3 database then we had to fuck up .



*/
