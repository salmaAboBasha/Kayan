package ebi.alex.Kayan.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    private String firstName;
    private String mobileNumber;
    private String email;
    private String password;
    private String confirmPassword;
    private String BusinessIndustry;
}
