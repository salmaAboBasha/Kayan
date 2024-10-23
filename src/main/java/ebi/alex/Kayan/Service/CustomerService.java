package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Entity.CustomerEntity;
import ebi.alex.Kayan.Exception.CustomException;
import ebi.alex.Kayan.Model.CustomerDto;

import ebi.alex.Kayan.Repo.CustomerRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class CustomerService implements CustomerServiceInt {
    private final CustomerRepoInt customerRepo;
    private final ModelMapper modelMapper=new ModelMapper();

    public CustomerService(CustomerRepoInt customerRepo) {
        this.customerRepo = customerRepo;

    }
    public boolean emailExists(String email) {
        return customerRepo.findByEmail(email) != null; // Assuming findByEmail returns null if no customer is found
    }

    @Override
    public boolean userLogedIn(String email, String password) throws CustomException {
        return customerRepo.findByEmailAndPassword(email,password) == null;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) throws CustomException {
        CustomerEntity customerEntity = modelMapper.map(customerDto,CustomerEntity.class);
        customerEntity = customerRepo.save(customerEntity);
        return modelMapper.map(customerEntity, CustomerDto.class);
    }


    @Override
    public CustomerDto checkCustomer(CustomerDto customerDto) {
        CustomerEntity customerEntity = modelMapper.map(customerDto,CustomerEntity.class);
        customerEntity=customerRepo.findByEmailAndPassword(customerEntity.getEmail(), customerEntity.getPassword());
        return modelMapper.map(customerEntity, CustomerDto.class);
    }
}