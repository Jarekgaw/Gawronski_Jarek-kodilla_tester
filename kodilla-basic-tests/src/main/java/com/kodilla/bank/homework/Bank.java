package com.kodilla.bank.homework;

public class Bank {
    private CashMachine machines[];
    private double size;

    public Bank(CashMachine[] machines) {
        this.machines = machines;
        this.size = machines.length;

    }


    public double getTotalBalance() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getBalance();
        }
        return result;
    }

    public int getNumberOfMinusTransaction() {
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
        int counter = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getAverageMinus();
        }
        return result / machines.length;
    }

    public double getTotalAveragePlus() {
        double result = 0;
        for (int i = 0; i < machines.length; i++) {
            result = result + machines[i].getAveragePlus();
        }
        return result/ machines.length;
    }

}


