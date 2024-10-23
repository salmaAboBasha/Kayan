package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Model.QuestionDto;
import ebi.alex.Kayan.Model.AnswerDto;
import ebi.alex.Kayan.Service.QuestionServiceInt;
import ebi.alex.Kayan.Service.AnswerServiceInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question/view")
public class QuestionViewController {

    private static final Logger logger = LoggerFactory.getLogger(QuestionViewController.class);
    private final QuestionServiceInt questionService;
    private final AnswerServiceInt answerService;

    public QuestionViewController(QuestionServiceInt questionService, AnswerServiceInt answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    @GetMapping("/getAll")
    public String getAllQuestions(Model model) {
        try {
            List<QuestionDto> questionDtos = questionService.getAllQuestions();

            if (questionDtos == null || questionDtos.isEmpty()) {
                logger.info("No questions found.");
            } else {
                logger.info("Found {} questions.", questionDtos.size());
            }

            for (QuestionDto question : questionDtos) {
                List<AnswerDto> answers = answerService.findAnswerByQuestionId(question.getId());
                question.setAnswers(answers);
            }

            model.addAttribute("questions", questionDtos);
            return "index"; // Make sure this corresponds to a view template
        } catch (Exception e) {
            logger.error("Error retrieving questions: ", e);
            model.addAttribute("errorMessage", "Unable to fetch questions. Please try again later.");
            return "error"; // Redirect to an error page if necessary
        }
    }
}
