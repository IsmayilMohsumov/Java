
package SOLID.OCP;

abstract public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean workingStatus;

    public Employee(int id, String name, String department, boolean workingStatus) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.workingStatus = workingStatus;
    }
    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", workingStatus=" + workingStatus + '}';
    }
    
    
    
}
