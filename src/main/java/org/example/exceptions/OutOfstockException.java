package org.example.exceptions;

public class OutOfstockException extends RuntimeException {
    public OutOfstockException(String message) {
        super(message);
    }
}
