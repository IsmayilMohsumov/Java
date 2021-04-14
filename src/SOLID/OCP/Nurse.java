package SOLID.OCP;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean workingStatus) {
        super(id, name, department, workingStatus);
    }

    @Override
    public void performDuties() {
        bloodTest();
        cleanPatientArea();
    }

    public void bloodTest() {
        System.out.println("Blood Testing... ");
    }

    public void cleanPatientArea() {
        System.out.println("cleaning.....");
    }

}
