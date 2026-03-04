import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Inputs
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        // Fixed Values
        int startValue = 1;
        int endValue = 2;   // Loop will run once (1 < 2)

        // Loop
        for (int i = startValue; i < endValue; i++) {

            switch (op) {

                case "+":
                    double additionResult = first + second;
                    System.out.println("Result: " + additionResult);
                    break;

                case "-":
                    double subtractionResult = first - second;
                    System.out.println("Result: " + subtractionResult);
                    break;

                case "*":
                    double multiplicationResult = first * second;
                    System.out.println("Result: " + multiplicationResult);
                    break;

                case "/":
                    if (second != 0) {
                        double divisionResult = first / second;
                        System.out.println("Result: " + divisionResult);
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }

        input.close();
    }
}
