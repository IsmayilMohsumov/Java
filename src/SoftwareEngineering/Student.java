
package SoftwareEngineering;

public class Student extends Person{
    private int registrationId;
    private Class course;

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public Class getCourse() {
        return course;
    }

    public void setCourse(Class course) {
        this.course = course;
    }
    
    void displayInformation(){
        System.out.println("Student "+ name +" " + surname +" \n Registration id is : "+ registrationId +"\n Student has this grade:" + course.getGrade() );
    }
    
    
    
    
    
    
    
}
