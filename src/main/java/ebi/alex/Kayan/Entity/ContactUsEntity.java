package ebi.alex.Kayan.Entity;
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
@Entity
public class ContactUsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String Fullname;
    String Email;
    String Subject;
    String Message;
}
