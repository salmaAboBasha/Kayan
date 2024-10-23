package ebi.alex.Kayan.Repo;

import ebi.alex.Kayan.Entity.CustomerEntity;
import ebi.alex.Kayan.Entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepoInt extends JpaRepository<QuestionEntity, Long> {
}
