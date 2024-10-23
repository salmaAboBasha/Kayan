package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Entity.CustomResponse;
import ebi.alex.Kayan.Exception.CustomException;
import ebi.alex.Kayan.Model.CustomerDto;
import ebi.alex.Kayan.Service.CustomerServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/Kayan/customer/View")
public class CustomerViewController {
    private final CustomerServiceInt customerService;

    public CustomerViewController(final CustomerServiceInt customerService) {
        this.customerService = customerService;
    }




    @PostMapping("/CreateCustomer")
    public String createCustomer(@ModelAttribute("checkCustomer") CustomerDto customerDto, Model model) {
        if (customerService.emailExists(customerDto.getEmail())) {
            model.addAttribute("emailError", "email already exists");
            model.addAttribute("signUpActive", true);

            return "register";
        }else if(!Objects.equals(customerDto.getConfirmPassword(), customerDto.getPassword())){
            model.addAttribute("checkPassword", "password does not match");
            model.addAttribute("signUpActive", true);
            return "register";
        }
        customerService.createCustomer(customerDto);
        return "redirect:/contactUs/View/contactusviewIndex";// Redirect to a success page
    }

    @GetMapping("/Login")
    public String checkCustomer(Model model) {
        model.addAttribute("checkCustomer", new CustomerDto());
        return "register";
    }
    @GetMapping("/index")
    public String goToHome() {
        return "redirect:/contactUs/View/contactusviewIndex";
    }

    @PostMapping ("/Check/Customer")
    public String checkCustomer(@ModelAttribute("checkCustomer")CustomerDto customerDto,Model model) {
        try {
            // Check if user is logged in (i.e., email and password match)
            if (customerService.userLogedIn(customerDto.getEmail(), customerDto.getPassword())) {
                // If email or password is incorrect, throw a CustomException
                model.addAttribute("Login", "email or Password Incorrect");
                return "register";
            }

            // If user is logged in, return success response
            customerService.checkCustomer(customerDto);
            return "redirect:/contactUs/View/contactusviewIndex";
        } catch (CustomException e) {
            throw new CustomException("Invalid email or password");
        }
    }

}