import java.util.Scanner;

public class FizzBuzzProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Fixed Values
        int minimumPositiveValue = 1;
        int multipleOfThree = 3;
        int multipleOfFive = 5;

        // Check for positive integer
        if (number >= minimumPositiveValue) {

            for (int i = minimumPositiveValue; i <= number; i++) {

                boolean isMultipleOfThree = (i % multipleOfThree) == 0;
                boolean isMultipleOfFive = (i % multipleOfFive) == 0;

                if (isMultipleOfThree && isMultipleOfFive) {

                    System.out.println("FizzBuzz");

                } else if (isMultipleOfThree) {

                    System.out.println("Fizz");

                } else if (isMultipleOfFive) {

                    System.out.println("Buzz");

                } else {

                    System.out.println(i);
                }
            }

        } else {

            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
