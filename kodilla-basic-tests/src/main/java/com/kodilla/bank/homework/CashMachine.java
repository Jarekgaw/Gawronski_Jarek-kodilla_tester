package com.kodilla.bank.homework;

public class CashMachine {
    private double[] accountBalance;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.accountBalance = new double[0];
    }

    public void add(double newValue) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(accountBalance, 0, newTab, 0, accountBalance.length);
        newTab[this.size - 1] = newValue;
        this.accountBalance = newTab;
    }
    public double getBalance() {
        double result = 0;
        for (int i = 0; i < accountBalance.length; i++) {
            result = result + accountBalance[i];
        }
        return result;
    }

    public int getTransactionNumber() {
        return size;

    }

    public int getNumberOfMinusTransaction() {
        int result = 0;
        for (int i = 0; i < accountBalance.length; i++) {
            if (accountBalance[i] < 0) {
                result = result + 1;
            }
        }
        return result;
    }

    public int getNumberOfPlusTransaction() {
        int result = 0;
        for (int i = 0; i < accountBalance.length; i++) {
            if (accountBalance[i] > 0) {
                result = result + 1;
            }
        }
        return result;
    }

    public double getAverageMinus() {
        double result = 0;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (accountBalance[i] < 0) {
                result = accountBalance[i] + result;
                counter++;
            }
        }
        if (result == 0) {
            return 0;
        }
        return result / counter;
    }

    public double getAveragePlus() {
        double result = 0;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (accountBalance[i] > 0) {
                result = accountBalance[i] + result;
                counter++;
            }
        }
        if (result == 0) {
            return 0;
        }
        return result / counter;
    }

}


