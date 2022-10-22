package br.com.springbootbrasil.bases.exception;

public class BaseException extends RuntimeException {

    int status;
    String error;

    public static final String DEFAULT_MESSAGE = "API.internal_error";
    public static final int DEFAULT_CODE = 500;

    public BaseException() {
        error = DEFAULT_MESSAGE;
        status = DEFAULT_CODE;
    }

    public BaseException(Exception ex) {
        super(DEFAULT_MESSAGE, ex);
        error = DEFAULT_MESSAGE;
        status = DEFAULT_CODE;
        ex.printStackTrace();
    }

    public BaseException(BaseException e) {
        super(e);
        status = e.status;
        error = e.error;
    }

    public BaseException(String message, Exception e) {
        super(message, e);
    }

    public BaseException(String message) {
        super(message);
        status = DEFAULT_CODE;
    }

    public BaseException(String message, String error) {
        super(message);
        this.status = DEFAULT_CODE;
        this.error = error;
    }

    public BaseException(String message, int status) {
        super(message);
        this.status = status;
        error = message;
    }

    public BaseException(String error, String message, int status) {
        super(message);
        this.status = status;
        this.error = error;
    }
}
