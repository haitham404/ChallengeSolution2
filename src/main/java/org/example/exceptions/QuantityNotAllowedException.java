package org.example.exceptions;

public class QuantityNotAllowedException extends RuntimeException {
    public QuantityNotAllowedException(String message) {
        super(message);
    }
}
