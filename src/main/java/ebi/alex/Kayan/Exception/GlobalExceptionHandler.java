package ebi.alex.Kayan.Exception;


import ebi.alex.Kayan.Entity.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({CustomException.class})
    public ResponseEntity<?> handleCustomException( CustomException customException) {
        return new ResponseEntity(new CustomResponse("02", "fail", customException.getMessage()), HttpStatus.OK);
    }

}
