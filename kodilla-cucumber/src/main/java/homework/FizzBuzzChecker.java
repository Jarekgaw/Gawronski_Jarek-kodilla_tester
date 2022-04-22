package homework;

public class FizzBuzzChecker {
    public String checkIfFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "";
        }
    }

    public String checkBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "";
        }
    }

    public String checkFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return "";
        }
    }

    public String checkNone(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "None";
        }
        return "";
    }
}

