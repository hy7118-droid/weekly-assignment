import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        int number = input.nextInt();

        // Variables
        int count = 0;
        int workingNumber = number;

        // Handle zero separately
        if (workingNumber == 0) {
            count = 1;
        } else {

            // Convert negative number to positive
            if (workingNumber < 0) {
                workingNumber = -workingNumber;
            }

            // Loop to count digits
            while (workingNumber != 0) {

                workingNumber = workingNumber / 10;  // Remove last digit
                count = count + 1;                  // Increase count
            }
        }

        // Output
        System.out.println("The number of digits in " 
                + number 
                + " is " 
                + count);

        input.close();
    }
}
