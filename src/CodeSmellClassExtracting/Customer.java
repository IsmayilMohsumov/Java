/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeSmellClassExtracting;

public class Customer {

    private String name;
    private String surname;
    /*      
     private String city;
     private String state;
     private String street;
     private Integer postalCode;
     private String birhday;
        Instead of bunch of Strings we created class
     */
    private Address address =null;
    private Birthday birthday=null;

    public Customer(String name, String surname, Address address, Birthday birthday) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.birthday = birthday;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
    
    public static void main(String[] args) {
        
        Address addressOfCustomer = new Address("Baku","Akhmedli", "14", 1100);
        Birthday birthDateOfCustomer = new Birthday(4, 3, 2001);
        Customer customer = new Customer("Ismayil","Mohsumov", addressOfCustomer, birthDateOfCustomer);
        System.out.println(customer.address.toString());
        System.out.println(customer.birthday.getBirthDate());
    }

}

class Address {

    private String city;
    private String state;
    private String street;
    private Integer postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Address(String city, String state, String street, Integer postalCode) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return getStreet()+" " + getCity() + " "+ getState() + " "+getPostalCode();
    }
   
}

class Birthday{
    private Integer day;
    private Integer month;
    private Integer year;

    public Birthday(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    
    public String getBirthDate(){
        return getDay()+"/"+getMonth()+"/"+getYear();
    }
    
    
}
