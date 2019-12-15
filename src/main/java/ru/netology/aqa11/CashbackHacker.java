package ru.netology.aqa11;//package ru.netology.aqa11;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}