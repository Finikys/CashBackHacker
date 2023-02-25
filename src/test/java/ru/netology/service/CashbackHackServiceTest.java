package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void calculateCashBackMin(){
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(expected, actual);

    }

    @Test
    public void calculateCashBackMax(){
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }
}