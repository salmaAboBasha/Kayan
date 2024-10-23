package ebi.alex.Kayan.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class QuestionDto {
    private Long id;
    private String question;
    private List<AnswerDto> answers;
}
