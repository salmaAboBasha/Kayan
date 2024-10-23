package ebi.alex.Kayan.Service;


import ebi.alex.Kayan.Model.CustomerDto;

public interface CustomerServiceInt {
//    public CustomerDto getCustomer(int id);
//    public List<CustomerDto> getAllCustomers();

    public CustomerDto createCustomer(CustomerDto customerDto);
    public CustomerDto checkCustomer(CustomerDto customerDto);
    public boolean emailExists(String email);
   public  boolean userLogedIn(String email, String password);
}
