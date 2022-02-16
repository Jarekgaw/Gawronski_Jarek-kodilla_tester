package com.kodilla.bank.homework;

public class Bank {
    private CashMaschine machines[];
    private double size;

    public Bank(CashMaschine[] machines) {
        this.machines = machines;
        this.size = size;

    }


    public double getTotalBalance() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getBalance();
        }
        return result;
    }

    public int getMinusMachines() {
        int result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getNumberOfMinusTransaction();
        }
        return result;
    }

    public int getTotalPlusMachines() {
        int result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getNumberOfPlusTransaction();
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
        return result/ machines.length;
    }
}


