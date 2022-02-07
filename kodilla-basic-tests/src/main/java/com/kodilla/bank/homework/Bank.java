package com.kodilla.bank.homework;

public class Bank {
    public CashMaschine machines[];

    public double getTotalBalance() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getBalance();
        }
        return result;
    }

    public int getTotalMinusMachines() {
        int result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getMinusTransaction();
        }
        return result;
    }

    public int getTotalPlusMachines() {
        int result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getPlusTransaction();
        }
        return result;
    }

    public double getTotalAverageMinus() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getAverageMinus();
        }
        return result;
    }

    public double getTotalAveragePlus() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getAveragePlus();
        }
        return result;
    }
}


