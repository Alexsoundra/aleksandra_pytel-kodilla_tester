package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {


    @Test
    public void shouldShowOverallBalance() {
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);
        CashMachine[] cashMachines = {cash1};

        Bank bank = new Bank(cashMachines);
        int result = bank.getOverallBalance();
        assertEquals(50, result);
    }

    @Test
    public void shouldShowNumbersOfWithdrawels() {
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);
        CashMachine[] cashMachines = {cash1};

        Bank bank = new Bank(cashMachines);
        int result = bank.withdrawals();
        assertEquals(1, result);
    }

    @Test
    public void shouldShowNumbersOfDeposits(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);
        CashMachine[] cashMachines = {cash1};

        Bank bank = new Bank(cashMachines);
        int result = bank.deposits();
        assertEquals(1, result);
    }

    @Test
    public void shouldShowAvaragePayout(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);
        CashMachine[] cashMachines = {cash1};

        Bank bank = new Bank(cashMachines);
        int result = bank.meanWithdrawals();
        assertEquals(-50,result);
    }
    @Test
    public void shouldShowAvaragePayment(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);
        CashMachine[] cashMachines = {cash1};

        Bank bank = new Bank(cashMachines);
        int result = bank.meanDeposits();
        assertEquals(100,result);
    }
}
