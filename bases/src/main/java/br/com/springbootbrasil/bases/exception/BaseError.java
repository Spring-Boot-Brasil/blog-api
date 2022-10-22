package br.com.springbootbrasil.bases.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseError {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime timestamp = LocalDateTime.now();
    private int status = 0;
    private String error;
    private String message;
    private String description;

    public BaseError(String error) {
        this.error = error;
        this.message = error;
    }

    public BaseError(String error, int status) {
        this.status = status;
        this.error = error;
    }

    public BaseError(String error, String message, int status) {
        this.status = status;
        this.error = error;
        this.message = message;
    }

    public BaseError(String error, String message, String description, int status) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.description = description;
    }
}
