package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    void add() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        assertEquals(2,cashMachine.getBalance());
    }

    @Test
    void getBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        assertEquals(2,cashMachine.getBalance());
    }

    @Test
    void getTransactionNumber() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(5);
        cashMachine.add(56);
        assertEquals(2,cashMachine.getTransactionNumber());
    }

    @Test
    void getNumberOfMinusTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        assertEquals(0,cashMachine.getNumberOfMinusTransaction());
    }

    @Test
    void getNumberOfPlusTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(3);
        assertEquals(1,cashMachine.getNumberOfPlusTransaction());
    }

    @Test
    void getAverageMinus() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(4);
        cashMachine.add(-4);
        cashMachine.add(-2);
        assertEquals(-3,cashMachine.getAverageMinus());
    }

    @Test
    void getAveragePlus() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(4);
        cashMachine.add(-4);
        cashMachine.add(-2);
        assertEquals(3,cashMachine.getAveragePlus());

    }
}