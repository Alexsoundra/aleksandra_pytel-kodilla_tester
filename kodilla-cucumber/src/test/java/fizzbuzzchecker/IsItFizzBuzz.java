package fizzbuzzchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzz implements En {

    private int number;
    private String result;

        public IsItFizzBuzz(){
            Given("number is divisible by 3", () ->{
                this.number = 3;
            });
            Given("number is divisible by 5", () ->{
                this.number = 5;
            });

            Given("number is divisible by 3 & 5", () ->{
                this.number = 15;
            });
            Given("number is not divisible by 3 or 5", () ->{
                this.number = 2;
            });

            When("I ask if it's FizzBuzz", () -> {
                FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
                this.result = fizzBuzzChecker.checkIfFizzBuzz(this.number);
            });

            Then("I should be told {string}", (String string) -> {
                Assert.assertEquals(string, this.result);
            });
        }

}
