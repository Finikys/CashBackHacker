package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
public class CashbackHackServiceTest {

    @Test
    public void calculateCashBackMin(){
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void calculateCashBackMax(){
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);

    }

}