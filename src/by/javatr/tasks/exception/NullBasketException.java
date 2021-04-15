package by.javatr.tasks.exception;

public class NullBasketException extends Exception{
    public NullBasketException() {
        super();
    }

    public NullBasketException(String message) {
        super(message);
    }

    public NullBasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBasketException(Throwable cause) {
        super(cause);
    }

    public NullBasketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
