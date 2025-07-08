package org.example.exceptions;

public class NotAbleToBuyException extends RuntimeException {
    public NotAbleToBuyException(String message) {
        super(message);
    }
}
