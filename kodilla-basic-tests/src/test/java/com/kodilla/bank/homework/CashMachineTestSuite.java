package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {


    @Test
    public void shouldShowOverallBalance() {
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);

        CashMachine cash2 = new CashMachine();
        cash2.depositMoney(1000);
        cash2.depositMoney(150);
        cash2.withdrawMoney(-200);
        cash2.withdrawMoney(-50);

        CashMachine cash3 = new CashMachine();
        cash3.depositMoney(50);
        cash3.withdrawMoney(-200);
        cash3.depositMoney(100);
        cash3.withdrawMoney(-50);

        CashMachine[] cashMachines = {cash1, cash2, cash3};

        Bank bank = new Bank(cashMachines);
        int result = bank.getOverallBalance();
        assertEquals(850, result);
    }

    @Test
    public void shouldShowNumbersOfWithdrawels() {
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);

        CashMachine cash2 = new CashMachine();
        cash2.depositMoney(1000);
        cash2.depositMoney(150);
        cash2.withdrawMoney(-200);
        cash2.withdrawMoney(-50);

        CashMachine cash3 = new CashMachine();
        cash3.depositMoney(50);
        cash3.withdrawMoney(-200);
        cash3.depositMoney(100);
        cash3.withdrawMoney(-50);

        CashMachine[] cashMachines = {cash1, cash2, cash3};

        Bank bank = new Bank(cashMachines);
        int result = bank.withdrawals();
        assertEquals(5, result);
    }

    @Test
    public void shouldShowNumbersOfDeposits(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);

        CashMachine cash2 = new CashMachine();
        cash2.depositMoney(1000);
        cash2.depositMoney(150);
        cash2.withdrawMoney(-200);
        cash2.withdrawMoney(-50);

        CashMachine cash3 = new CashMachine();
        cash3.depositMoney(50);
        cash3.withdrawMoney(-200);
        cash3.depositMoney(100);
        cash3.withdrawMoney(-50);

        CashMachine[] cashMachines = {cash1, cash2, cash3};

        Bank bank = new Bank(cashMachines);
        int result = bank.deposits();
        assertEquals(5, result);
    }

    @Test
    public void shouldShowAvaragePayout(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);

        CashMachine cash2 = new CashMachine();
        cash2.depositMoney(1000);
        cash2.depositMoney(150);
        cash2.withdrawMoney(-200);
        cash2.withdrawMoney(-50);

        CashMachine cash3 = new CashMachine();
        cash3.depositMoney(50);
        cash3.withdrawMoney(-200);
        cash3.depositMoney(100);
        cash3.withdrawMoney(-50);

        CashMachine[] cashMachines = {cash1, cash2, cash3};

        Bank bank = new Bank(cashMachines);
        int result = bank.meanWithdrawals();
        assertEquals(-110,result);
    }
    @Test
    public void shouldShowAvaragePayment(){
        CashMachine cash1 = new CashMachine();
        cash1.depositMoney(100);
        cash1.withdrawMoney(-50);

        CashMachine cash2 = new CashMachine();
        cash2.depositMoney(1000);
        cash2.depositMoney(150);
        cash2.withdrawMoney(-200);
        cash2.withdrawMoney(-50);

        CashMachine cash3 = new CashMachine();
        cash3.depositMoney(50);
        cash3.withdrawMoney(-200);
        cash3.depositMoney(100);
        cash3.withdrawMoney(-50);

        CashMachine[] cashMachines = {cash1, cash2, cash3};

        Bank bank = new Bank(cashMachines);
        int result = bank.meanDeposits();
        assertEquals(280,result);
    }
}
