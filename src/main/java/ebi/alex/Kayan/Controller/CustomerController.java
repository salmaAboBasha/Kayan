package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Entity.CustomResponse;
import ebi.alex.Kayan.Exception.CustomException;
import ebi.alex.Kayan.Model.CustomerDto;

import ebi.alex.Kayan.Service.CustomerServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Kayan/customer")
public class CustomerController {
    private final CustomerServiceInt customerService;
    public CustomerController(final CustomerServiceInt customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/CreateCustomer")
    public ResponseEntity<?> CreateCustomer(@RequestBody final CustomerDto customerDto) {
        return new ResponseEntity<>(new CustomResponse("01","success",customerService.createCustomer(customerDto)), HttpStatus.OK);
    }

    @GetMapping("/Check/Customer")
    public ResponseEntity<?> checkCustomer(@RequestBody final CustomerDto customerDto) {
        try {
            // Check if user is logged in (i.e., email and password match)
            if (customerService.userLogedIn(customerDto.getEmail(), customerDto.getPassword())) {
                // If email or password is incorrect, throw a CustomException
                throw new CustomException("Invalid email or password");
            }

            // If user is logged in, return success response
            CustomerDto customerData = customerService.checkCustomer(customerDto);
            return new ResponseEntity<>(new CustomResponse("01", "success", customerData), HttpStatus.OK);

        } catch (CustomException e) {
            // This will be caught by the @ExceptionHandler below
            throw new CustomException("Invalid email or password");
        }
    }
}