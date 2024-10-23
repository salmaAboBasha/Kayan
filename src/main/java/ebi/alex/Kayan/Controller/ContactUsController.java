package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Model.ContactUsDto;

import ebi.alex.Kayan.Service.ContactUsServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contactUs")
public class ContactUsController {
        private final ContactUsServiceInt contactUsService;
        ContactUsController(ContactUsServiceInt contactUsServiceInt)
        {
            this.contactUsService = contactUsServiceInt;
        }
    @PostMapping
    public ResponseEntity<ContactUsDto> sendQuestion(@RequestBody ContactUsDto contactUsDto) {
        ContactUsDto contactUsDtoSaved = contactUsService.SendQuestion(contactUsDto);
        return new ResponseEntity<>(contactUsDtoSaved, HttpStatus.OK);
    }
    }
