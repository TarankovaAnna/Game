package ru.netology.domain;

public class NoOneIsRegisteredException extends RuntimeException {
    public NoOneIsRegisteredException() {
        super("Нет зарегистрированных игроков");
    }
}