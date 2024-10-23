package ebi.alex.Kayan.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ebi.alex.Kayan.Entity.ContactUsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ContactUsDto {

    String Fullname;
    String Email;
    String Subject;
    String Message;

}
