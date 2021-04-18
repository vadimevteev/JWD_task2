package by.javatr.tasks.exception;

public class IncorrectIndexException extends Exception{
    public IncorrectIndexException() {
    }

    public IncorrectIndexException(String message) {
        super(message);
    }

    public IncorrectIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectIndexException(Throwable cause) {
        super(cause);
    }
}
