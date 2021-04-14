package CodeSmell;

public class TechnicalDebt {

    public static void main(String[] args) throws Exception {
        CustomerDAO customerDAO = new CustomerDAO();
        Customer customer = new Customer();
        
        customer =customer.setCustomerIdBuilder(1)
                .setCustomerNameBuilder("Ismayil")
                .setCustomerSurnameBuilder("Mohsumov")
                .setCustomerIDBuilder("AZE123")
                .createPollutantEntry();
        
        customerDAO.add(customer);
//        System.out.println(customer.getCustomerName());
        
    }

}
