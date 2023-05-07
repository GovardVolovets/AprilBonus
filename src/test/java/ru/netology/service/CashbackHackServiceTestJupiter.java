package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CashbackHackServiceTestJupiter {

    @Test
    public void testRemain900() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain999() {

        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1500() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}
