public class DistanceConverter {

    public static void main(String[] args) {

        // Fixed Values
        double distanceInKilometers = 10.8;
        double kilometerToMileFactor = 1.6;

        // Calculation
        double distanceInMiles = distanceInKilometers * kilometerToMileFactor;

        // Output
        System.out.println("The distance " + distanceInKilometers 
                + " km in miles is " + distanceInMiles);
    }
}
