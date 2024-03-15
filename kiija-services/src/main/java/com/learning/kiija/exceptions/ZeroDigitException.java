package com.learning.kiija.exceptions;

public class ZeroDigitException extends RuntimeException {
    
    public ZeroDigitException() {
        super();
    }

    public ZeroDigitException(String message) {
        super(message);
    }

    public ZeroDigitException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDigitException(Throwable cause){
        super(cause);
    }
}
