package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Entity.ContactUsEntity;
import ebi.alex.Kayan.Model.ContactUsDto;

public interface ContactUsServiceInt {
    ContactUsDto SendQuestion(ContactUsDto contactUsDto);
}
