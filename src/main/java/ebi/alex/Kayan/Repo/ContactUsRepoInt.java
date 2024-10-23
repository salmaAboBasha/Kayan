package ebi.alex.Kayan.Repo;


import ebi.alex.Kayan.Entity.ContactUsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactUsRepoInt extends JpaRepository<ContactUsEntity, Long> {

}
