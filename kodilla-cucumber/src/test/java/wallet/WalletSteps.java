package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
    }

    public void  WalletZero(){
        Given("I have deposited $30 in my wallet", () -> {
            wallet.deposit(30);
            Assert.assertEquals("Incorrect wallet balance", 30, wallet.getBalance());
        });

        When("I request $40", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 40);
        });
        Then("it shouldn't be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
    }
}