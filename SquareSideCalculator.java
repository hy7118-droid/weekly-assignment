import java.util.Scanner;

public class SquareSideCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        double perimeterOfSquare = input.nextDouble();

        // Fixed Value
        int numberOfSides = 4;

        // Calculation
        double sideLength = perimeterOfSquare / numberOfSides;

        // Output
        System.out.println("The length of the side is " 
                + sideLength 
                + " whose perimeter is " 
                + perimeterOfSquare);

        input.close();
    }
}
