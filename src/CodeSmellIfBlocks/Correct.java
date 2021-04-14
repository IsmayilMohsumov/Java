package CodeSmellIfBlocks;

class PersonDTO{
    private String name;
    private String surname;

    public PersonDTO(String name, String surname) {
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


interface PersonDAO2 {
    void add(PersonDTO person);
    boolean userExists(PersonDTO person);
}


class PersonDAOImplOracleDB implements PersonDAO2{

    @Override
    public void add(PersonDTO person) {
        System.out.println("Added to Oracle Database");
    }

    @Override
    public boolean userExists(PersonDTO person) {
        return true;
    }
    
}


class PersonDAOImplMySQLDB implements PersonDAO2{

    @Override
    public void add(PersonDTO person) {
        System.out.println("Added to MYSQL Database");
    }

    @Override
    public boolean userExists(PersonDTO person) {
        return true;
    }
        
}


class PersonService {
    PersonDAO2 personDAO;

    public PersonService(PersonDAO2 personDAO) {
        this.personDAO = personDAO;
    }
    public void add(PersonDTO person){
        //if user null statements
        //validation
        PersonValidation2.userExists(person);
        personDAO.add(person);
    }
}

class PersonValidation2{
    public static boolean userExists(PersonDTO person) {
        return true;
    }
}


public class Correct {

   
    public static void main(String[] args) {
    PersonService person = new PersonService(new PersonDAOImplMySQLDB());
    person.add(new PersonDTO("isi", null));
    }
    
}
