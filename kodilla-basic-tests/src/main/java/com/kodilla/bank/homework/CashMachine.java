package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;
    private int deposit;
    private int withdraw;

    public CashMachine(){
        this.transactions = new int[0];
        this.deposit = deposit;
        this.withdraw = withdraw;
    }
    public void add(int trasaction){
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(trasaction, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = trasaction;
        this.transactions = newTab;
    }
    public int[] showInCashMachine() {
        return transactions;
    }

    public int depositMoney (int transact){
        if(transact > 0){
            return deposit;
        }
    }

    public int withdrawMoney (int transact){
        if (transact < 0){
            return withdraw;
        }
    }

}
