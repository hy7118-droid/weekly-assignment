import java.util.Scanner;

public class TriangleAreaConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Inputs
        double baseInCentimeters = input.nextDouble();
        double heightInCentimeters = input.nextDouble();

        // Fixed Value
        double centimeterPerInch = 2.54;

        // Calculations
        double areaInSquareCentimeters = 0.5 * baseInCentimeters * heightInCentimeters;
        double areaInSquareInches = areaInSquareCentimeters 
                / (centimeterPerInch * centimeterPerInch);

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                + areaInSquareInches 
                + " and sq cm is " 
                + areaInSquareCentimeters);

        input.close();
    }
}
