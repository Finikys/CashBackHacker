package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void shouldReturn998Amount2000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 2000;

        int actual = cashback.remain(amount);
        int expexted = 998;


    }

}