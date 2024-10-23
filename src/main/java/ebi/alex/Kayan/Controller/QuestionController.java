package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Entity.AnswerEntity;
import ebi.alex.Kayan.Entity.CustomResponse;
import ebi.alex.Kayan.Model.AnswerDto;
import ebi.alex.Kayan.Model.QuestionDto;
import ebi.alex.Kayan.Service.AnswerServiceInt;
import ebi.alex.Kayan.Service.QuestionService;
import ebi.alex.Kayan.Service.QuestionServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionServiceInt questionService;


    public QuestionController(QuestionServiceInt questionService) {
        this.questionService = questionService;

    }

    @GetMapping
    public ResponseEntity<?> getAllQuestions() {
        List<QuestionDto> findAllQuestions = questionService.getAllQuestions();
        return new ResponseEntity<>(new CustomResponse("01", "success", findAllQuestions), HttpStatus.OK);
    }
}
