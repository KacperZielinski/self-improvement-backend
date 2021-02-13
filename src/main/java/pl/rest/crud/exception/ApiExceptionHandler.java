package pl.rest.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;
import java.util.HashMap;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public HashMap<String, String> handleEntityNotFoundException(Exception e) {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "Entity not found!");
        response.put("error", e.getClass().getSimpleName());

        return response;
    }
}
