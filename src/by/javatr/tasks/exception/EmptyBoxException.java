package by.javatr.tasks.exception;

public class EmptyBoxException extends Exception{
    public EmptyBoxException() {
        super();
    }

    public EmptyBoxException(String message) {
        super(message);
    }

    public EmptyBoxException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyBoxException(Throwable cause) {
        super(cause);
    }

    public EmptyBoxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
