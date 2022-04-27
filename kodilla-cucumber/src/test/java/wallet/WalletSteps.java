package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {

            Given("I have deposited {int} in my wallet", (Integer deposit) -> {
                wallet.deposit(deposit);
            });

            When("I request {int}", (Integer deposit) -> {
                cashier.withdraw(wallet, deposit);
            });

            Then("{int} should be dispensed", (Integer deposit) -> {
                Assert.assertEquals(deposit, cashSlot.getContents());
            });
            Then("the balance of my wallet should be {int}", (Integer deposit) -> {
                Assert.assertEquals("Incorrect wallet balance", deposit, wallet.getBalance());
            });

            Given("there is {int} in my wallet", (Integer deposit) -> {
                wallet.deposit(deposit);
            });

            When("I withdraw {int}", (Integer deposit) -> {
                cashier.withdraw(wallet, deposit);
            });

            Then("nothing should be dispensed", () -> {
                Assert.assertEquals((Integer) 0, cashSlot.getContents());
            });

            Then("I should be told {string}", (String string) -> {
                Assert.assertEquals(string, "You don't have that much money");
            });

            When("I check the balance of my wallet", () -> {
                wallet.getBalance();
                Assert.assertNotNull(wallet.getBalance());
            });

            Then("I should see that the balance is {int}", (Integer deposit) -> {
                Assert.assertEquals(deposit, wallet.getBalance());
            });

        }
    }