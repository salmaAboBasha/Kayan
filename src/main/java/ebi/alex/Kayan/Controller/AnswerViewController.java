package ebi.alex.Kayan.Controller;

import ebi.alex.Kayan.Entity.CustomResponse;
import ebi.alex.Kayan.Model.AnswerDto;
import ebi.alex.Kayan.Model.ContactUsDto;
import ebi.alex.Kayan.Service.AnswerServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Answer/view")
public class AnswerViewController {
    private final AnswerServiceInt answerService;

    public AnswerViewController(AnswerServiceInt answerService) {
        this.answerService = answerService;
    }


    @GetMapping("/answerOfQuestion/{questionId}")
    public String getAnswerOfQuestion(@PathVariable Long questionId, Model model) {
        List<AnswerDto> allAnswers = answerService.findAnswerByQuestionId(questionId);
        model.addAttribute("allAnswers", allAnswers);
        return "redirect:/contactUs/View/contactusviewIndex";
    }
}
