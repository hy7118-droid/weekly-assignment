import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Fixed Value
        int zeroValue = 0;

        // Check the number
        if (number > zeroValue) {

            System.out.println("positive");

        } else if (number < zeroValue) {

            System.out.println("negative");

        } else {

            System.out.println("zero");
        }

        input.close();
    }
}
