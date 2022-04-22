package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private String answer;
    private int number;


    public IsItFizzBuzzSteps () {
        Given("Given number is 3", () -> {

            // Write code here that turns the phrase above into concrete actions
            this.number = 3;

        });

        Given("Given number is 6", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 6;

        });

        Given("Given number is 5", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 5;

        });

        Given("Given number is 10", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 10;

        });

        Given("Given number is 15", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 15;

        });

        Given("Given number is 30", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 30;

        });

        Given("Given number is 1", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 1;

        });



        Given("Given number is 91", () -> {

            // Write code here that turns the phrase above into concrete actions

            this.number = 91;
        });



        When("I ask about the password for the given number", () -> {

            // Write code here that turns the phrase above into concrete actions
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkIfFizz(this.number);
            this.answer = fizzBuzzChecker.checkBuzz(this.number);
            this.answer = fizzBuzzChecker.checkFizzBuzz(this.number);
            this.answer = fizzBuzzChecker.checkNone(this.number);

        });

        Then("I should be told {string}", (String string) -> {


            Assert.assertNotEquals(string, this.answer);

        });
    }
}
