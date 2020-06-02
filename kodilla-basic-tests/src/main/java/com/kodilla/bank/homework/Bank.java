package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    int[] withdrawals;
    int[] deposits;
    int withdrawalsSize;
    int depositsSize;


    public Bank(CashMachine[] cashMachines){
        this.cashMachines = cashMachines;
        this.withdrawals = new int[50];
        this.deposits = new int[50];
    }
    private void addWithdrawal(int transaction){
        this.withdrawalsSize++;
       withdrawals[this.withdrawalsSize] = transaction;
    }
    private void addDeposits(int transaction){
        this.depositsSize++;
        deposits[this.depositsSize] = transaction;
    }

    public int getOverallBalance(){
        int sum = 0;
        for(int i =0; i < cashMachines.length; i++){
           CashMachine c = cashMachines[i];

           for (int j=0; j < c.transactions.length;j++){
              int transact = c.transactions[j];
              sum = sum + transact;
           }
        }
        return sum;
    }

    public int withdrawals(){
        this.withdrawals = new int[50];
        for(int i =0; i < cashMachines.length; i++){
            CashMachine c = cashMachines[i];
            for (int j=0; j < c.transactions.length;j++){
                int transact = c.transactions[j];
                if(transact < 0){
                    addWithdrawal(transact);
                }
            }
        }
        return withdrawalsSize;
    }

    public int deposits(){
        this.deposits = new int[50];
        for(int i =0; i < cashMachines.length; i++){
            CashMachine c = cashMachines[i];

            for (int j=0; j < c.transactions.length;j++){
                int transact = c.transactions[j];
                if(transact > 0){
                    addDeposits(transact);
                }
            }
        }
        return depositsSize;

    }

    public int meanDeposits(){
        deposits();
        int sum = 0;
        for (int deposit : deposits) {
            sum = sum + deposit;
        }
        return sum/depositsSize;
    }

    public int meanWithdrawals(){
        withdrawals();
        int sum = 0;
        for (int withdrawal : withdrawals) {
            sum = sum + withdrawal;
        }
        return sum/withdrawalsSize;
    }
}
