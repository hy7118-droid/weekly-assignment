import java.util.Scanner;

public class NaturalNumberSumCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Fixed Value
        int minimumNaturalNumber = 1;

        // Check and Calculation
        if (number >= minimumNaturalNumber) {

            int sumOfNaturalNumbers = number * (number + 1) / 2;

            System.out.println("The sum of " 
                    + number 
                    + " natural numbers is " 
                    + sumOfNaturalNumbers);

        } else {

            System.out.println("The number " 
                    + number 
                    + " is not a natural number");
        }

        input.close();
    }
}
