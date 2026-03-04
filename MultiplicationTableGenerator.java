import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Fixed Values
        int startMultiplier = 6;
        int endMultiplier = 9;

        // Loop to generate multiplication table
        for (int i = startMultiplier; i <= endMultiplier; i++) {

            int product = number * i;

            System.out.println(number + " * " + i + " = " + product);
        }

        input.close();
    }
}
