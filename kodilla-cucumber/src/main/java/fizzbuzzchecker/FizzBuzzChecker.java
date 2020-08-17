package fizzbuzzchecker;

public class FizzBuzzChecker {

    public String checkIfFizzBuzz (int number){
        if (number % 3){
            return "Fizz";
        }else (number % 5){
            return "Buzz";
        }else (number % 3) && (number % 5){
            return "FizzBuzz";
        }else if{
            return "Nope";}
    }
}
