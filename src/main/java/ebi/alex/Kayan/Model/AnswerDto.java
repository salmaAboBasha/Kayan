package ebi.alex.Kayan.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {
    private Long id;
    private String answer;
    private QuestionDto questionDto;
}
