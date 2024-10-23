package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Entity.CustomResponse;
import ebi.alex.Kayan.Model.AnswerDto;
import ebi.alex.Kayan.Service.AnswerServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerServiceInt answerService;

    public AnswerController(AnswerServiceInt answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/answerOfQuestion/{questionId}")
    public ResponseEntity<?> getAnswerOfQuestion(@PathVariable Long questionId) {
        List<AnswerDto> allAnswers = answerService.findAnswerByQuestionId(questionId);
        return new ResponseEntity<>(new CustomResponse("01", "success", allAnswers), HttpStatus.OK);
    }
}
