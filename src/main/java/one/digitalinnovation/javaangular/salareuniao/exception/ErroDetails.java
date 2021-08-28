package one.digitalinnovation.javaangular.salareuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErroDetails {

    private Date timestamp;
    private String message;
    private String details;

}
