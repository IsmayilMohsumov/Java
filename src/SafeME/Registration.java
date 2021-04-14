package SafeME;

public class Registration {
    private String email;
    private String password;
    private Integer age;

    public Registration(String email, String password, Integer age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public Registration() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    
    
    
    public static void main(String[] args) {
        
    }
}
