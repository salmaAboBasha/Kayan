package ebi.alex.Kayan.Repo;

import ebi.alex.Kayan.Entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnswerRepoInt extends JpaRepository<AnswerEntity, Long> {
    @Query(value = "SELECT * FROM answer_entity a WHERE a.question_id = :questionId", nativeQuery = true)
    List<AnswerEntity> findAnswerByQuestionId(Long questionId);
}
