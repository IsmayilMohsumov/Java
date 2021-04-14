

package SOLID.OCP;

public class Main {

    public static void main(String[] args) {
        HospitalManagement hospitalManagement =new HospitalManagement();
        Employee nurse =new Nurse(1,"Susan","emergency", true);
        Employee doctor =new Nurse(2,"Alexa","emergency", true);
        hospitalManagement.callUpon(nurse);
        
        
    }
    
}
