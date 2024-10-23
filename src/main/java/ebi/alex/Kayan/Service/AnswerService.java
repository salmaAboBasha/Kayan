package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Entity.AnswerEntity;
import ebi.alex.Kayan.Model.AnswerDto;
import ebi.alex.Kayan.Repo.AnswerRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnswerService implements AnswerServiceInt {
    private final AnswerRepoInt answerRepo;
    private final ModelMapper modelMapper = new ModelMapper();

    public AnswerService(AnswerRepoInt answerRepo) {
        this.answerRepo = answerRepo;
    }

    @Override
    public List<AnswerDto> findAnswerByQuestionId(Long questionId) {
        List<AnswerEntity> answerEntities = answerRepo.findAnswerByQuestionId(questionId);
        return answerEntities.stream()
                .map(answerEntity -> modelMapper.map(answerEntity, AnswerDto.class))
                .collect(Collectors.toList());
    }
}
