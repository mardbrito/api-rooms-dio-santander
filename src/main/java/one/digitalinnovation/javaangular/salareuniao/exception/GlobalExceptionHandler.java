package one.digitalinnovation.javaangular.salareuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception{

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request){
        ErroDetails erroDetails=new ErroDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(erroDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?>globalExceptionHandler(Exception ex, WebRequest request){
        ErroDetails erroDetails=new ErroDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(erroDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
