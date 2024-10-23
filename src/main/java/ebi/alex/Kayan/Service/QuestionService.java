package ebi.alex.Kayan.Service;

import ebi.alex.Kayan.Entity.QuestionEntity;
import ebi.alex.Kayan.Model.QuestionDto;
import ebi.alex.Kayan.Repo.QuestionRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService implements QuestionServiceInt {
    private final QuestionRepoInt questionRepo;
    private final ModelMapper modelMapper=new ModelMapper();
    public QuestionService(QuestionRepoInt questionRepo) {
        this.questionRepo=questionRepo;
    }

    @Override
    public List<QuestionDto> getAllQuestions() {
        List<QuestionEntity> questionsEntity=questionRepo.findAll();
        return questionsEntity.stream().map(questionEntity -> modelMapper.map(questionEntity,QuestionDto.class)).collect(Collectors.toList());
    }
}
