import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        double weightInPounds = input.nextDouble();

        // Fixed Value
        double kilogramPerPound = 2.2;

        // Calculation
        double weightInKilograms = weightInPounds * kilogramPerPound;

        // Output
        System.out.println("The weight of the person in pounds is " 
                + weightInPounds 
                + " and in kg is " 
                + weightInKilograms);

        input.close();
    }
}
