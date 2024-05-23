package ru.geekbrains.core.lesson4.Homework4;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
