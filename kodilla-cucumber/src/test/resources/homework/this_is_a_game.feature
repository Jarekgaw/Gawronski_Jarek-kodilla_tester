Feature: This is a game "Fizz-Buzz-None"
  if a number is divisible by 5 & 3 - say "FizzBuzz", if by 3 - say "Fizz", if by 5 - say "Buzz"
  in another case - say "None"

  Scenario Outline: Answer the right word as a reaction to a given number
    Given Given number is <number>
    When I ask about the password for the given number
    Then I should be told <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 6      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 1      | "None"     |
      | 91     | "None"     |