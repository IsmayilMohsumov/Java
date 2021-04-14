

package CodeSmell;


public class Customer {
    private Integer id;
    private String customerName;
    private String customerSurname;
    private String customerIdentityNumber;

    //CONSTRUCTORS>
    public Customer(Integer id, String customerName, String customerSurname, String customerIdentityNumber) {
        this.id = id;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerIdentityNumber = customerIdentityNumber;
    }
//
//    public Customer(Integer id, String customerName, String customerSurname) {
//        this.id = id;
//        this.customerName = customerName;
//        this.customerSurname = customerSurname;
//    }

    

    Customer() {
        
    }


   
     

    
    //BUILDER PATTERN>
    public Customer setCustomerIdBuilder(Integer id) {
        this.id =id;
        return this;
    }
    public Customer setCustomerNameBuilder(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public Customer setCustomerSurnameBuilder(String customerSurname) {
        this.customerSurname = customerSurname;
        return this;
    }
    public Customer setCustomerIDBuilder(String customerIdentityNumber) {
        this.customerIdentityNumber = customerIdentityNumber;
        return this;
    }

    public Customer createPollutantEntry() {
        return new Customer(id,customerName,customerSurname,customerIdentityNumber);
    }

    
    
    
    
    
    
    
    
    
    //GETTERS AND SETTERS>
    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerIdentityNumber() {
        return customerIdentityNumber;
    }

    public void setCustomerIdentityNumber(String customerIdentityNumber) {
        this.customerIdentityNumber = customerIdentityNumber;
    }
    
    
    
}
