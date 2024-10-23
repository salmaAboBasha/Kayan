package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Model.AnswerDto;

import java.util.List;

public interface AnswerServiceInt {
    List<AnswerDto> findAnswerByQuestionId(Long questionId);
}
