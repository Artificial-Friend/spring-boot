package spring.boot.springapp.exception;

public class DataProcessException extends RuntimeException {
    public DataProcessException(String message) {
        super(message);
    }
}
