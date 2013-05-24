package io.theysay.affectr.client.exceptions;

public class AffectRException extends RuntimeException {
    public AffectRException() {
    }

    public AffectRException(String message) {
        super(message);
    }

    public AffectRException(String message, Throwable cause) {
        super(message, cause);
    }

    public AffectRException(Throwable cause) {
        super(cause);
    }

    public AffectRException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
