package io.theysay.client.exceptions;

public class AffectrException extends RuntimeException {
    public AffectrException() {
    }

    public AffectrException(String message) {
        super(message);
    }

    public AffectrException(String message, Throwable cause) {
        super(message, cause);
    }

    public AffectrException(Throwable cause) {
        super(cause);
    }

    public AffectrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
