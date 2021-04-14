package Z;

import java.util.Random;
import java.util.Scanner;

class User {

    private String name;
    private String surname;
    private Integer age;

    public User() {
    }

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

}

public class Test {

    private Scanner sc = new Scanner(System.in);
    private User user;

    public static void main(String[] args) {
        Test test = new Test();
        test.fill();
    }

    public void fill() {
        user = new User();
        System.out.println("Please enter your name:");
        user.setName(sc.next());
        System.out.println("Please enter your surname:");
        user.setSurname(sc.next());
        System.out.println("Please enter your age:");
        user.setAge(sc.nextInt());
        if (isValid(user)) {
        hash(user);    
        }
        
    }
    
    public boolean isValid(User u) {
        return u!=null;
    }

    private void hash(User user) {
        if (isValid(user)) {
            char[] chars = {'$','#','*','!','@','$','#','*','!','@'};
            int a= (int) Math.random()*10;
            System.out.println(a);
        }else {
            
            System.out.println("bosh");
            
        }
    }


}
