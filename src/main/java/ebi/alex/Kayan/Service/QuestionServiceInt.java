package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Model.QuestionDto;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;

public interface QuestionServiceInt {
    public List<QuestionDto> getAllQuestions();
}
