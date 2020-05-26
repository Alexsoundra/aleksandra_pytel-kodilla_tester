package com.kodilla.bank.homework;

public class CashMachine {

    public int[] transactions;
    private int size;
    private int deposit;
    private int withdraw;

    public CashMachine(){
        this.transactions = new int[50];

    }
    private void add(int trasaction){
        this.size++;
        transactions[this.size] = trasaction;

    }
    public int[] showInCashMachine() {
        return transactions;
    }

    public void depositMoney (int transact){
        add(transact);
        }

    public void withdrawMoney (int transact){
      add(transact);
        }

}
