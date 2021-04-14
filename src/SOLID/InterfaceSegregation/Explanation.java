package SOLID.InterfaceSegregation;

public class Explanation {
    public static void main(String[] args) {
        Athletee john = new JohnDoe2();
        john.compete();
    }
}

interface Athlete {
    void compete();
    void swim();
    void highJump();
    void longJump();
}//We have added the method compete(yarishmaq), but also there some extra methods like swim, highJump , and longJump.

//Suppose that John Doe is a swimming athlete
class JohnDoe implements Athlete {
//By implementing the Athlete interface, we have to implement methods like highJump and longJump, which JohnDoe will never use.

    @Override
    public void compete() {
        System.out.println("John Doe Started to compete....");
    }

    @Override
    public void swim() {
        System.out.println("John DOe started swimming...");
    }

    @Override
    public void highJump() {
    }

    @Override
    public void longJump() {
    }

    //The same problem will occur for another athlete who might be a field Athlete competing in the high jump and long jump.
}

//To achieve Interface Segregation Principle : 
interface Athletee {

    void compete();
}

interface SwimmingAthlete extends Athletee {

    void swim();
}

interface JumpingAthlete extends Athlete {

    void highJump();

    void longJump();
}
//And therefore John Doe will not have to implement actions that he is not capable of performing:
class JohnDoe2 implements SwimmingAthlete {

     @Override
    public void compete() {
        System.out.println("John Doe Started to compete....2");
    }

    @Override
    public void swim() {
        System.out.println("John DOe started swimming...2");
    }
    
}
