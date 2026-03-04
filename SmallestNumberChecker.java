import java.util.Scanner;

public class SmallestNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Inputs
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Calculation
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " 
                + isFirstSmallest);

        input.close();
    }
}
