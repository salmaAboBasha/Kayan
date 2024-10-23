package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Model.ContactUsDto;
import ebi.alex.Kayan.Service.ContactUsServiceInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactUs/View")
public class ContactUsViewController {


        private final ContactUsServiceInt contactUsService;

        ContactUsViewController(ContactUsServiceInt contactUsServiceInt)
        {
            this.contactUsService = contactUsServiceInt;
        }
    @GetMapping("/contactusview")
    public String SendQuestionView( Model model) {
        model.addAttribute("contactUsDto",new ContactUsDto());
        return"contact";
    }
    @GetMapping("/srvices")
    public String showServices( ) {

        return"services";
    }
    @GetMapping("/about")
    public String showAbout( ) {

        return"about";
    }
    @GetMapping("/contactusviewIndex")
    public String SendQuestionViewIndex( Model model) {
        model.addAttribute("contactUsDto",new ContactUsDto());
        return"index";
    }

    @PostMapping
    public String sendQuestion(@ModelAttribute("contactUsDto") ContactUsDto contactUsDto) {
       contactUsService.SendQuestion(contactUsDto);
        return"contact";
    }
    @PostMapping("/postIndex")

    public String sendQuestionIndex(@ModelAttribute("contactUsDto") ContactUsDto contactUsDto) {
        contactUsService.SendQuestion(contactUsDto);
        return"redirect:/contactUs/View/contactusviewIndex";
    }



    }
