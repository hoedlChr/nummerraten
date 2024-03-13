package nummerraten;

public class NotANumberException extends Exception{
    public NotANumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotANumberException(String message) {
        super(message);
    }
}
