package by.javatr.tasks.exception;

public class FullBasketException extends Exception{
    public FullBasketException() {
    }

    public FullBasketException(String message) {
        super(message);
    }

    public FullBasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullBasketException(Throwable cause) {
        super(cause);
    }
}
