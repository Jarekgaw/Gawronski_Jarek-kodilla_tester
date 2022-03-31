package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();


    @Test
    public void shouldGetTotalBalance() {
        cashMachine1.add(2);
        cashMachine1.add(3);
        cashMachine1.add(-1);
        cashMachine2.add(1);
        cashMachine2.add(-3);
        cashMachine3.add(10);
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};
        Bank bank = new Bank(machines);
        assertEquals(12, bank.getTotalBalance());
    }

    @Test
    public void shouldGetMinusMachines() {
        cashMachine1.add(2);
        cashMachine1.add(3);
        cashMachine1.add(-1);
        cashMachine2.add(1);
        cashMachine2.add(-3);
        cashMachine3.add(10);
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};
        Bank bank = new Bank(machines);
        assertEquals(2, bank.getNumberOfMinusTransaction());

    }
    @Test
    public void shouldGetTotalPlusMachines() {
        cashMachine1.add(2);
        cashMachine1.add(3);
        cashMachine1.add(-1);
        cashMachine2.add(1);
        cashMachine2.add(-3);
        cashMachine3.add(10);
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};
        Bank bank = new Bank(machines);
        assertEquals(4, bank.getTotalPlusMachines());
    }
    @Test
        public void shouldGetTotalAverageMinus () {
            cashMachine1.add(2);
            cashMachine1.add(3);
            cashMachine1.add(-2);
            cashMachine2.add(1);
            cashMachine2.add(-4);
            cashMachine3.add(10);
            CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};
            Bank bank = new Bank(machines);
            assertEquals(-2, bank.getTotalAverageMinus());

        }
    @Test
        public void shouldGetTotalAveragePlus () {
            cashMachine1.add(2);
            cashMachine1.add(3);
            cashMachine1.add(-1);
            cashMachine2.add(1);
            cashMachine2.add(-3);
            cashMachine3.add(10);
            CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};
            Bank bank = new Bank(machines);
            assertEquals(4.5, bank.getTotalAveragePlus());
        }
    }
