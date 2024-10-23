package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Entity.ContactUsEntity;
import ebi.alex.Kayan.Model.ContactUsDto;
import ebi.alex.Kayan.Repo.ContactUsRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService implements ContactUsServiceInt {

    private final ContactUsRepoInt contactUsRepo;
    private final ModelMapper modelMapper=new ModelMapper();
    public ContactUsService( ContactUsRepoInt contactUsRepo) {
        this.contactUsRepo = contactUsRepo;

}
    @Override
    public ContactUsDto SendQuestion(ContactUsDto contactUsDto) {
        ContactUsEntity mappedEntity =modelMapper.map(contactUsDto, ContactUsEntity.class);
        ContactUsEntity contactUsEntitysave = contactUsRepo.save(mappedEntity);
        return modelMapper.map(contactUsEntitysave, ContactUsDto.class);
    }

}
