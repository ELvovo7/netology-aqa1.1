package ru.netology.aqa11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    @Test
    void amount_900_expected_100() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void amount_1000_expected_0() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;

        int actual =cashbackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}