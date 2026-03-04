public class PenDistributionCalculator {

    public static void main(String[] args) {

        // Fixed Values
        int totalPens = 14;
        int totalStudents = 3;

        // Calculations
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent 
                + " and the remaining pen not distributed is " + remainingPens);
    }
}
