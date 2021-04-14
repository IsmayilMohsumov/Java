
package SOLID.OCP;


public class Doctor extends Employee{

    public Doctor(int id, String name, String department, boolean workingStatus) {
        super(id, name, department, workingStatus);
    }

    
    @Override
    public void performDuties() {
        medicalSupport();
        diagnosePatients();
    }
    
    public void medicalSupport(){
        System.out.println("Supporting doctor...");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing Patients....");
    }
    
}
