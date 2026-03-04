public class HarryAgeCalculator {

    public static void main(String[] args) {

        // Fixed Values
        String personName = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculation
        int age = currentYear - birthYear;

        // Output
        System.out.println(personName + "'s age in " + currentYear + " is " + age);
    }
}
