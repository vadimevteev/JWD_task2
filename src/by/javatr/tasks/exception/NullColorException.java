package by.javatr.tasks.exception;

public class NullColorException extends Exception{

    public NullColorException() {
    }

    public NullColorException(String message) {
        super(message);
    }

    public NullColorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullColorException(Throwable cause) {
        super(cause);
    }
}
