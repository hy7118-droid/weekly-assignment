import java.util.Scanner;

public class DivisibilityByFiveChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Fixed Value
        int divisor = 5;

        // Calculation
        boolean isDivisible = (number % divisor) == 0;

        // Output
        System.out.println("Is the number " 
                + number 
                + " divisible by " 
                + divisor 
                + "? " 
                + isDivisible);

        input.close();
    }
}
