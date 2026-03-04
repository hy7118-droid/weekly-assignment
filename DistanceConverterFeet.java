import java.util.Scanner;

public class DistanceConverterFeet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        double distanceInFeet = input.nextDouble();

        // Fixed Values
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Calculations
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Output
        System.out.println("The distance in yards is " 
                + distanceInYards 
                + " while the distance in miles is " 
                + distanceInMiles);

        input.close();
    }
}
