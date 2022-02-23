package by.mahanko.array.exception;

import java.lang.Exception;

public class CustomException extends Exception{ // FIXME: 23.02.2022 more constructors
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
