package by.mahanko.array.exception;

public class CustomFileDoesntExistException extends Exception {
    public CustomFileDoesntExistException() {
        super();
    }

    public CustomFileDoesntExistException(String message) {
        super(message);
    }
}
