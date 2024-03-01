package simple_formal_projects_2;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    void setCustomer(String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum =  socSecurityNum;
    }
    void setBillingAddress(String street, String city, String state, String zip){
        this.billingAddress = new Address(street, city, state, zip);
    }

    void setShippingAddress(String street, String city, String state, String zip){
        this.shippingAddress = new Address(street, city, state, zip);
    }

    public String toString(){
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer();
        customers[0].setCustomer("Henok", "Gebru", "IOWA45");
        customers[0].setBillingAddress("10023st", "Iowa", "Fairfield", "52557");
        customers[0].setShippingAddress("10023st", "Iowa", "Fairfield", "52557");

        customers[1] = new Customer();
        customers[1].setCustomer("mical", "sam", "546389");
        customers[1].setBillingAddress("1024", "Iowa", "Chicago", "52557");
        customers[1].setShippingAddress("1024", "Iowa", "Chicago", "52557");

        customers[2] = new Customer();
        customers[2].setCustomer("mikal", "selemu", "fy6789");
        customers[2].setBillingAddress("1000N", "Iowa", "pensilvenia", "52557");
        customers[2].setShippingAddress("1000N", "Iowa", "pensilvenia", "52557");

        for(Customer customer: customers){
            if(customer.billingAddress.state.equals("Chicago")){
                System.out.println(customer.toString());
            }
        }

    }


}
